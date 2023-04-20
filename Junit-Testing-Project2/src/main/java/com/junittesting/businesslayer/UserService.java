package com.junittesting.businesslayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.junittesting.model.User;

@Service
public class UserService {

	@Autowired
	RestTemplate restTemplate;
	
	public String getUser() {
		ResponseEntity<User> obj = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/posts/1", User.class);
		User userObj = obj.getBody();
		System.out.println(userObj);
		return userObj.getTitle();
	}
}
