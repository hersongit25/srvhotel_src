package com.mdm.srvhotel;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class SrvhotelApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(SrvhotelApplication.class, args);
	}
	
	@Override
	public void run(ApplicationArguments args) throws Exception{
		System.out.println("init of application...");
	}

}
