package com.mdm.srvhotel;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class appStart implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(appStart.class, args);
	}
	
	@Override
	public void run(ApplicationArguments args) throws Exception{
		System.out.println("Inicio de la Application...");
	}
}
