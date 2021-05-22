package com.example.demo.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloADController {
	
	@RequestMapping("/hello")
	public String Hello() {
		return "Hi";
	}

}
