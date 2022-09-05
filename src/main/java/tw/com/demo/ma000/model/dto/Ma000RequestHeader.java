package tw.com.demo.ma000.model.dto;

import javax.validation.constraints.NotBlank;

public class Ma000RequestHeader {
	
	@NotBlank(message = "不得空白 sys")
	private String sys ;
	 
	@NotBlank(message = "不得空白 api")
	private String api ;
	
	private Long time ;

	public String getSys() {
		return sys;
	}

	public void setSys(String sys) {
		this.sys = sys;
	}

	public String getApi() {
		return api;
	}

	public void setApi(String api) {
		this.api = api;
	}

	public Long getTime() {
		return time;
	}

	public void setTime(Long time) {
		this.time = time;
	}
	
}
