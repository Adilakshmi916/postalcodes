package com.shopping.flipkart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.flipkart.service.DemoService;

import jakarta.websocket.server.PathParam;

@RestController
public class DemoController {
	
	@Autowired
	DemoService demoService;
	@GetMapping("/get")
	public String getValue(@PathParam("nassar") String name) {
		return demoService.getValue(name);
	}
}
