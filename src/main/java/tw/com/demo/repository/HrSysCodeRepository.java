package tw.com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import tw.com.demo.entity.HrSysCodeEntity;
import tw.com.demo.entity.HrSysCodeEntityPkey;

public interface HrSysCodeRepository extends CrudRepository<HrSysCodeEntity, HrSysCodeEntityPkey> {
	
	public List<HrSysCodeEntity> findByPkGp(String gp);
	
	//jpql 
	@Query("select t from HrSysCodeEntity t where gp = ?1 and code = ?2 and status = 'Y'")
	public HrSysCodeEntity findByPkGAndPkCode(String gp, String code);
	
	
	//原生sql 
	@Query(value="select * from Hr_Sys_Code t where gp = ?1 and status = 'Y'", nativeQuery = true)
	public List<HrSysCodeEntity> findByGp(String gp);
}	
