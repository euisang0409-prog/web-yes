package com.korea.todo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.korea.todo.service.HelloService;

@RestController
@RequestMapping("api")
public class HelloController {

	private final HelloService helloService;
	
	 public HelloController(HelloService helloService) {
	        this.helloService = helloService;
	    }
	
	@GetMapping("hello")
	public String hello(@RequestParam String name) {
		return helloService.getHelloMessage(name);
	}
}
