package tw.com.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import tw.com.example.rest.entity.HrSysStaffAddr;
import tw.com.example.rest.entity.HrSysStaffAddrPkey;


public interface HrSysStaffAddrRespository extends CrudRepository<HrSysStaffAddr, HrSysStaffAddrPkey> {
	
	public List<HrSysStaffAddr> findByPkIden(String iden);
	
	public HrSysStaffAddr findByPkIdenAndPkType(String iden,String type);

	
}
