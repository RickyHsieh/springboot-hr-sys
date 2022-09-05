package tw.com.demo.entity;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="HR_SYS_LEAVE_DTL")
public class HrSysLeaveDtlEntity {
	
	@Id
	private int id;
	
	private int year;
	
	private String leaveType;
	
	private String iden;
	
	private int leaveOwnHours;
	
	private int leaveApplyHours;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date leaveBeginTime;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date leaveEndTime;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date creTime;
	
	private String creUser;

	private String remark;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public String getIden() {
		return iden;
	}

	public void setIden(String iden) {
		this.iden = iden;
	}

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

	public String getCreUser() {
		return creUser;
	}

	public void setCreUser(String creUser) {
		this.creUser = creUser;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getLeaveBeginTime() {
		return leaveBeginTime;
	}

	public void setLeaveBeginTime(Date leaveBeginTime) {
		this.leaveBeginTime = leaveBeginTime;
	}

	public Date getLeaveEndTime() {
		return leaveEndTime;
	}

	public void setLeaveEndTime(Date leaveEndTime) {
		this.leaveEndTime = leaveEndTime;
	}

	public Date getCreTime() {
		return creTime;
	}

	public void setCreTime(Date creTime) {
		this.creTime = creTime;
	}

	
}
