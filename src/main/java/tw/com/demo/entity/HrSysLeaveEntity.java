package tw.com.demo.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="HR_SYS_LEAVE")
public class HrSysLeaveEntity {
	
	@EmbeddedId
	private HrSysLeavePKey pk;
	
	private int leaveOwnHours;
	
	private int leaveApplyHours;

	public int getLeaveOwnHours() {
		return leaveOwnHours;
	}

	public void setLeaveOwnHours(int leaveOwnHours) {
		this.leaveOwnHours = leaveOwnHours;
	}

	public int getLeaveApplyHours() {
		return leaveApplyHours;
	}

	public void setLeaveApplyHours(int leaveApplyHours) {
		this.leaveApplyHours = leaveApplyHours;
	}

	public HrSysLeavePKey getPk() {
		return pk;
	}

	public void setPk(HrSysLeavePKey pk) {
		this.pk = pk;
	}
	
	
	
}
