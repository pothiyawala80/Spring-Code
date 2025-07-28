package com.abdulla.testController.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	
	@Value("${application.properties.source}")
	String application_properties_source;
	
	@GetMapping("/version")
	public String getControllerVersion() {
		return "This is version 2 and properties source is : "+application_properties_source;
	}
}
