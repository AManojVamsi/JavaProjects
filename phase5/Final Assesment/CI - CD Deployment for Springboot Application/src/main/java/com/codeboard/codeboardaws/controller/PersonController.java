package com.codeboard.codeboardaws.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	@RequestMapping("/getname")
	public String getName() {
		return "Deployment of Springboot Application using Jenkins on AWS EC2 instance";
	}
}
