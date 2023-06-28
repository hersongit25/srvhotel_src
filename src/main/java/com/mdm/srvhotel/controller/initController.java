package com.mdm.srvhotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class initController {

	@RequestMapping(value="/hello")
	public String helloApp() {
		System.out.println("entra a hello");
		return "sayHello";
	}
}
