package tw.com.demo.ma001.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Ma001Controller {
	
	@Autowired
	Ma001ServiceImpl ma001ServiceImpl;
	
	@PostMapping("/login")
	public Ma001Response login(@Valid @RequestBody Ma001Request request) {
		
		System.out.println("login#Start");
		
		return  ma001ServiceImpl.login(request);
		
	}

}
