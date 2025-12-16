package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

	@GetMapping("/")
    public String hello() {
        return "Hello from Kubernetes Latestt!";
    }
	
	@GetMapping("/test_app")
    public String test_app() {
        return "Hello from Test App!";
	}

	@PostMapping("/test_app2")
    public String test_app2(String test_str) {
        return "Hello from Test App! "+test_str;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
