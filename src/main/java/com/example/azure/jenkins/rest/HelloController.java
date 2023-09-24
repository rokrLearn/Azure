package com.example.azure.jenkins.rest;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.azure.jenkins.model.ResponseContext;

@RestController
public class HelloController {

	@GetMapping("/version")
	public ResponseContext getVersion() {
		ResponseContext response = new ResponseContext(true,new Date());
		return response;
	}
}
