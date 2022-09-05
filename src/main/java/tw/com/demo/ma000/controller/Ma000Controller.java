package tw.com.demo.ma000.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tw.com.demo.ma000.model.dto.Ma000Request;
import tw.com.demo.ma000.model.dto.Ma000Response;
import tw.com.demo.ma000.service.Ma000ServiceImpl;


@RestController
public class Ma000Controller {

	@Autowired
	Ma000ServiceImpl ma000ServiceImpl ;
	
	@PostMapping("/syscode")
	public Ma000Response query(@Valid @RequestBody Ma000Request request) {
		System.out.println("ma000#start");
		
		
		
		return ma000ServiceImpl.query(request);
	}
	
}
