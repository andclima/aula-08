package io.github.andclima.aula08;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Aula08Application {

	public static void main(String[] args) {
		SpringApplication.run(Aula08Application.class, args);
	}

	@GetMapping("/hello")
	public String hello() {
		return String.format("Hello World!");
	}

}
