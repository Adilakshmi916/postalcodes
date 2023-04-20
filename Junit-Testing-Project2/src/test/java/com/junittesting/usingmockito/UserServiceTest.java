package com.junittesting.usingmockito;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.junittesting.businesslayer.UserService;
import com.junittesting.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

	@InjectMocks
	private UserService userService;
	
	@Mock
	RestTemplate restTemplate;
	
	@Mock
	User user ;
	
	@Before
	public void setUp() {
		user = new User();
		user.setBody("This is Body");
		user.setId(2);
		user.setTitle("This is Title");
		user.setUserId(2);
	}
	
	@Test
	public void getUserTest() {

		
		Mockito.when(restTemplate.getForEntity("https://jsonplaceholder.typicode.com/posts/1", User.class)).thenReturn(new ResponseEntity <User>(user, HttpStatus.OK));
		assertEquals("This is Title", userService.getUser());

	}
}
