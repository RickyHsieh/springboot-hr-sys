package tw.com.demo.repository;

import org.springframework.data.repository.CrudRepository;

import tw.com.example.rest.entity.HrSysStaffEntity;

public interface HrSysStaffRespository extends CrudRepository<HrSysStaffEntity, String>{
	
	public HrSysStaffEntity findByIden(String Iden);
	
	public HrSysStaffEntity findByPwd(String pwd);

	public HrSysStaffEntity findByIdenAndPwd(String iden, String pwd);
	
}
