package com.user.postalcodes.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.user.postalcodes.model.PostalDetails;
import com.user.postalcodes.model.PostalResponse;
import com.user.postalcodes.model.PostalUserDetails;
import com.user.postalcodes.model.ProductDetails;
import com.user.postalcodes.model.UserBody;
import com.user.postalcodes.model.UserDetails;
import com.user.postalcodes.model.UserTitle;

@Service
public class PostalServiceImpl implements Postal{
	
	
	;
	@Autowired
	RestTemplate restTemplate;
	
	public List<PostalDetails>fetchPostalDetailsByCity(String cityValue) {
		String url="https://api.postalpincode.in/postoffice/"+cityValue;
		
		System.out.println("Url is:"+url);
		
		ResponseEntity<PostalResponse[]>postalResponseEntity=
				restTemplate.getForEntity(url, PostalResponse[].class);
		
		System.out.println("Response is; "+postalResponseEntity.getBody());
		PostalResponse[] postalResponse = postalResponseEntity.getBody();
		System.out.println(postalResponse[0].getPostOffice());
		
		List<PostalDetails> postalDetails = new ArrayList<PostalDetails>();
		
		for(int i=0 ; i< postalResponse[0].getPostOffice().size();i++) {
			PostalDetails postalSingle = new PostalDetails();
			postalSingle.setState(postalResponse[0].getPostOffice().get(i).getState());
			postalSingle.setCountry(postalResponse[0].getPostOffice().get(i).getCountry());
			postalSingle.setPincode(postalResponse[0].getPostOffice().get(i).getPincode());
			postalDetails.add(postalSingle);
		}
        return postalDetails;
	}
//	public List<UserDetails>fetchUserDetailsByCity(int posts) {
//		String url="https://jsonplaceholder.typicode.com"+posts;
//		
//		System.out.println("Url is:"+url);
//		
//		ResponseEntity<PostalResponse[]>postalUserEntity=
//				restTemplate.getForEntity(url, PostalResponse[].class);
//		
//		System.out.println("Response is; "+postalUserEntity.getBody());
//		PostalResponse[] postalResponse = postalUserEntity.getBody();
//         	System.out.println(postalResponse[0].getPostOffice());
//		
//		List<UserDetails> userDetails = new ArrayList<UserDetails>();
//		
//		for(int i=0 ; i< postalResponse[0].getPostalUser().size();i++) {
//			UserDetails postalDouble = new UserDetails();
//			postalDouble.setUserId(postalResponse[0].getPostalUser().get(i).getUserId());
//			postalDouble.setId(postalResponse[0].getPostalUser().get(i).getId());
//			postalDouble.setTitle(postalResponse[0].getPostalUser().get(i).getTitle());
//			postalDouble.setBody(postalResponse[0].getPostalUser().get(i).getBody());
//			
//			userDetails.add(postalDouble);
//		}
//        return userDetails;
//	}
	public UserDetails fetchUserDetailsById(int id) {
		 String url="https://jsonplaceholder.typicode.com/posts/"+id;
		 System.out.println("Url is:"+url);
		 UserDetails userEntity=restTemplate.getForEntity (url, UserDetails.class).getBody();
		 return userEntity;
		 
	}
	public UserTitle fetchUserTitlesById(int id) {
		String url="https://jsonplaceholder.typicode.com/posts/"+id;
		System.out.println("Url is:"+url);
		UserDetails userEntity=restTemplate.getForEntity (url, UserDetails.class).getBody();
		UserTitle usertitle=new UserTitle();
		usertitle.setUserId(userEntity.getUserId());
		usertitle.setTitle(userEntity.getTitle());
		return usertitle;
		
	}
	public UserBody fetchUserBodiesById(int id) {
		String url="https://jsonplaceholder.typicode.com/posts/"+id;
		System.out.println("Url is:"+url);
		UserDetails userEntity=restTemplate.getForEntity (url, UserDetails.class).getBody();
		UserBody userbody=new UserBody();
		userbody.setId(userEntity.getId());
		userbody.setBody(userEntity.getBody());
		return userbody;
		
		}
	public ProductDetails fetchProductDetailsById(int num) {
		 String url="https://fakestoreapi.com/products/"+num;
		 System.out.println("Url is:"+url);
		 ProductDetails userEntity=restTemplate.getForEntity (url, ProductDetails.class).getBody();
		 return userEntity;
	

	}
}
	

