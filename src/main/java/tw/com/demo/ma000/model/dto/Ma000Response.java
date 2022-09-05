package tw.com.demo.ma000.model.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;


public class Ma000Response {
	
	@Valid
	@NotNull(message = "header 不得為null")
	private Ma000ResponseHeader header ;
	
	@NotNull(message = "header 不得為null")
	private Ma000ResponseBody body ;

	public Ma000ResponseHeader getHeader() {
		return header;
	}

	public void setHeader(Ma000ResponseHeader header) {
		this.header = header;
	}

	public Ma000ResponseBody getBody() {
		return body;
	}

	public void setBody(Ma000ResponseBody body) {
		this.body = body;
	}
	
	

}
