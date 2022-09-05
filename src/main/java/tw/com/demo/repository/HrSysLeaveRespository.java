package tw.com.demo.repository;


import org.springframework.data.repository.CrudRepository;

import tw.com.example.rest.entity.HrSysLeaveEntity;
import tw.com.example.rest.entity.HrSysLeavePKey;

public interface HrSysLeaveRespository extends CrudRepository<HrSysLeaveEntity, HrSysLeavePKey> {
	
	HrSysLeaveEntity findByPkIdenAndPkLeaveType(String iden, String type);
	
	
}
