package com.example.MongoSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude={ SecurityAutoConfiguration.class })
public class MongoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoSpringApplication.class, args);
	}

}

@RestController
@RequestMapping("/")
class HelloController {
	@GetMapping
	public String hello() {
		return "Hello Everyone";
	}
}