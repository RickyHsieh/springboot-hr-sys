package tw.com.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import tw.com.example.rest.entity.HrSysCalEntity;

public interface HrSysCalRespository extends CrudRepository<HrSysCalEntity, Integer> {
	
	@Transactional(rollbackOn = Exception.class)
	public void deleteBySys(String sys);
	
}
