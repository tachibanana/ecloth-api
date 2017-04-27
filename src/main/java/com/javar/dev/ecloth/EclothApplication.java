package com.javar.dev.ecloth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.javar.dev.ecloth")
public class EclothApplication {

	public static void main(String[] args) {
		SpringApplication.run(EclothApplication.class, args);
	}
}
