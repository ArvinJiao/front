package com.wezebra.controller;


import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wezebra.service.HelloService;

@RestController
public class HelloController {
	
	@Resource
	private HelloService helloService;

	@RequestMapping("/hello")
	public String hello(){
		String hello = helloService.hello();
		return hello;
	}
	
	
}