package com.mdm.srvhotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mdm.srvhotel.service.userSrv;

@Controller
public class initController {
	
	@Autowired
	userSrv UsrService;

	@RequestMapping(value="/hello")
	public String helloApp() {
		System.out.println("entra a hello");
		
		return "sayHello";
	}
	
	@RequestMapping( value="/testuser" )
	public ResponseEntity<Object> test(){
		return new ResponseEntity<>( UsrService.testUser(), HttpStatus.OK );
	}
}
