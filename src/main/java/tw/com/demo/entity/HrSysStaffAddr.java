package tw.com.demo.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HR_SYS_STAFF_ADDR")
public class HrSysStaffAddr {
	
	@EmbeddedId
	private HrSysStaffAddrPkey pk;
	
	private String zipCode;
	
	private String addr;



	public HrSysStaffAddrPkey getPk() {
		return pk;
	}

	public void setPk(HrSysStaffAddrPkey pk) {
		this.pk = pk;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}
