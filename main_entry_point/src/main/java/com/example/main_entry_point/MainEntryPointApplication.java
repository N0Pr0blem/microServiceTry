package com.example.main_entry_point;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MainEntryPointApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainEntryPointApplication.class, args);
	}

}
