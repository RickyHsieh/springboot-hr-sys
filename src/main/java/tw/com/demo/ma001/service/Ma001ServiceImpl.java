package tw.com.demo.ma001.service;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import tw.com.example.rest.entity.HrSysLoginEntity;
import tw.com.example.rest.entity.HrSysStaffEntity;
import tw.com.example.rest.repository.HrSysLoginRespository;
import tw.com.example.rest.repository.HrSysStaffRespository;
import tw.com.example.rest.vo.Ma001Request;
import tw.com.example.rest.vo.Ma001Response;
import tw.com.example.rest.vo.Ma001ResponseBody;
import tw.com.example.rest.vo.Ma001ResponseHeader;

@Service
public class Ma001ServiceImpl {

	@Autowired
	HrSysLoginRespository hrSysLoginRespository;

	@Autowired
	HrSysStaffRespository hrSysStaffRespository;

	public Ma001Response login(@RequestBody Ma001Request request) {

		String inputIden = request.getBody().getIden();
		String inputPwd = request.getBody().getPwd();

		String token = UUID.randomUUID().toString(); // 製作token
		System.out.println("請求參數 iden : " + inputIden);
		System.out.println("請求參數 Pwd : " + inputPwd);

		HrSysStaffEntity idenExist = hrSysStaffRespository.findByIden(inputIden); // 查詢是否有這帳號

		System.out.println("查詢帳號是否存在: " + idenExist);

		Ma001ResponseHeader header = new Ma001ResponseHeader();
		Ma001ResponseBody body = new Ma001ResponseBody();

		header.setApi(request.getHeader().getApi());
		header.setSys(request.getHeader().getSys());
		header.setTime(request.getHeader().getTime());

		// 組成 Response 的 Header
		if (inputPwd != null && idenExist == null) {
			header.setCode("0001");
			header.setDesc("查無使用者");

		} else if (inputPwd != null && inputPwd.equals(idenExist.getPwd())) {

			header.setCode("0000");
			header.setDesc("登入成功");
			// 將產生的Token值寫入 HR_SYS_LOGIN 的資料表，
			// 其中 CRE_TIME 為當下系統時間，EFFECTIVE_TIME 為 CRE_TIME 加上 30 MIN
			// 組成 Response 的 Body
			HrSysLoginEntity hrSysLoginEntity = new HrSysLoginEntity();
			// 格式化時間
			Date currentDate = new Date();// 當前時間

			Calendar calendar = Calendar.getInstance();
			calendar.setTime(currentDate);
			calendar.add(Calendar.MINUTE, 30);
			Date AfterTime = calendar.getTime();

			hrSysLoginEntity.setEffectiveTime(AfterTime);
			System.out.println("增加30分 : " + AfterTime);

			hrSysLoginEntity.setCreTime(currentDate);
			hrSysLoginEntity.setIden(inputIden);
			hrSysLoginEntity.setToken(token);
			body.setToken(token);

			hrSysLoginRespository.save(hrSysLoginEntity);
		} else if (inputPwd != null && !(inputPwd.equals(idenExist.getPwd()))) {
			header.setCode("0002");
			header.setDesc("密碼錯誤");
		} else {
			header.setCode("9999");
			header.setDesc("系統錯誤");
		}
		Ma001Response response = new Ma001Response();
		response.setBody(body);
		response.setHeader(header);
		return response;
	}
}
