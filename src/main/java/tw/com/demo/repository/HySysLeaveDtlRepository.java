package tw.com.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import tw.com.example.rest.entity.HrSysLeaveDtlEntity;

public interface HySysLeaveDtlRepository extends CrudRepository<HrSysLeaveDtlEntity, Integer> {

	public List<HrSysLeaveDtlEntity> findByYearAndIden(int year, String iden);
	
	public List<HrSysLeaveDtlEntity> findByIden(String iden);
}


