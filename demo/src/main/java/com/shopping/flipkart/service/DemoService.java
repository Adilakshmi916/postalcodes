package com.shopping.flipkart.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

	public String getValue(String name) {
		return  "Hi " + name + " your order is prepared";
	}
}
