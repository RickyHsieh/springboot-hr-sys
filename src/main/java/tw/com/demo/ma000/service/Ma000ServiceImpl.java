package tw.com.demo.ma000.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tw.com.demo.entity.HrSysCodeEntity;
import tw.com.demo.ma000.model.dto.Ma000Request;
import tw.com.demo.ma000.model.dto.Ma000Response;
import tw.com.demo.ma000.model.dto.Ma000ResponseBody;
import tw.com.demo.ma000.model.dto.Ma000ResponseData;
import tw.com.demo.ma000.model.dto.Ma000ResponseHeader;
import tw.com.demo.repository.HrSysCodeRepository;


@Service
public class Ma000ServiceImpl {

	@Autowired
	HrSysCodeRepository hrSysCodeRepository;
	
	public Ma000Response query(Ma000Request request) {
		
		Ma000ResponseHeader header = new Ma000ResponseHeader();
		Ma000ResponseBody body = new Ma000ResponseBody();
		Ma000Response response = new Ma000Response();
		
		//組成 Response 的 Body
		String gp = request.getBody().getGp();		
		List<Ma000ResponseData> dataList = getHrSysCodeData(gp);
		body.setData(dataList);
		body.setGp(request.getBody().getGp());
		
		if(dataList.isEmpty()) {
			dataNotFound(header);
		} else {
			querySucceed(header);
		}
		
		//組成 Response 的 Header
		header.setSys(request.getHeader().getSys());
		header.setApi(request.getHeader().getApi());
		header.setTime(System.currentTimeMillis());
		response.setHeader(header);
		response.setBody(body);
		return response;
	}

	private void querySucceed(Ma000ResponseHeader header) {
		header.setCode("0000");
		header.setDesc("查詢成功");
	}

	private void dataNotFound(Ma000ResponseHeader header) {
		header.setCode("0001");
		header.setDesc("查無資料");
	}
	
	private List<Ma000ResponseData> getHrSysCodeData(String gp) {
		
		List<HrSysCodeEntity> entityList = hrSysCodeRepository.findByPkGp(gp);
		List<Ma000ResponseData> dataList = new ArrayList<>();
		
		//組成 Response 的 Body 裡的資料明細
		for(int i = 0 ; i < entityList.size() ; i ++ ) {
			System.out.println(entityList.get(i));
			Ma000ResponseData data = new Ma000ResponseData();
			data.setCode(entityList.get(i).getPk().getCode());
			data.setCname(entityList.get(i).getCname());
			dataList.add(data);
		}
		return dataList;
	}
	
}
