package tw.com.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HR_SYS_CAL")
public class HrSysCalEntity {
	
	@Id
	private Integer id;
	
	private String sys;
	
	private int calYear;
	
	private Date calDate;

	private String calDay;
	
	private String isHoliday;
	
	private String remark;

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSys() {
		return sys;
	}

	public void setSys(String sys) {
		this.sys = sys;
	}

	public Date getCalDate() {
		return calDate;
	}

	public void setCalDate(Date calDate) {
		this.calDate = calDate;
	}



	public String getIsHoliday() {
		return isHoliday;
	}

	public void setIsHoliday(String isHoliday) {
		this.isHoliday = isHoliday;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getCalYear() {
		return calYear;
	}

	public void setCalYear(int calYear) {
		this.calYear = calYear;
	}

	public String getCalDay() {
		return calDay;
	}

	public void setCalDay(String calDay) {
		this.calDay = calDay;
	}

	
	
}
