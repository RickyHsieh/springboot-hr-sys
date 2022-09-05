package tw.com.demo.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HR_SYS_CODE")
public class HrSysCodeEntity {
	
	@EmbeddedId
	private HrSysCodeEntityPkey pk;
	
	private String cname;
	
	private String ename;
	
	private String parantCode;
	
	private String seqNo;
	
	private String status;

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getParantCode() {
		return parantCode;
	}

	public void setParantCode(String parantCode) {
		this.parantCode = parantCode;
	}

	public String getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(String seqNo) {
		this.seqNo = seqNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public HrSysCodeEntityPkey getPk() {
		return pk;
	}

	public void setPk(HrSysCodeEntityPkey pk) {
		this.pk = pk;
	}
	
}
