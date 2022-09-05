package tw.com.demo.repository;


import org.springframework.data.repository.CrudRepository;
import tw.com.example.rest.entity.HrSysLoginEntity;
import tw.com.example.rest.entity.HrSysStaffEntity;

public interface HrSysLoginRespository extends CrudRepository<HrSysLoginEntity, String>{
	
	public HrSysLoginEntity findByToken(String token);
	
	
	
}
