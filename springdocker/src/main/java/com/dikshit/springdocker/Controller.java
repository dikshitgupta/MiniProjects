package com.dikshit.springdocker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/hello")
	public String helloController(){
		return "hello this is spring from java";
	}

}

