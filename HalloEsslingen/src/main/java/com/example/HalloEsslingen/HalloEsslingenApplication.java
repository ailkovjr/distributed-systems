package com.example.HalloEsslingen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HalloEsslingenApplication {

	public static void main(String[] args) {
		SpringApplication.run(HalloEsslingenApplication.class, args);
	}

	@RestController
	class Hello {
		@RequestMapping("/")
		String greeting() {
			return "Hallo Esslingen!";
		}
	}
}
