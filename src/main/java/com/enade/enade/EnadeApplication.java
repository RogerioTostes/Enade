package com.enade.enade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class EnadeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnadeApplication.class, args);
			System.out.print(new BCryptPasswordEncoder().encode("123"));
	}

}

