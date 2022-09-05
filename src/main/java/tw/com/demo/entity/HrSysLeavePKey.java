package tw.com.demo.entity;

import java.io.Serializable;

public class HrSysLeavePKey implements Serializable {
	
	private int year;
	
	private String iden;

	private String leaveType;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getIden() {
		return iden;
	}

	public void setIden(String iden) {
		this.iden = iden;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}
	
	

}
