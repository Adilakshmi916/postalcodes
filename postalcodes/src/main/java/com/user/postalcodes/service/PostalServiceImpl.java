package com.user.postalcodes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.user.postalcodes.model.PostalDetails;
import com.user.postalcodes.model.PostalResponse;
import com.user.postalcodes.model.PostalUserDetails;

@Service
public class PostalServiceImpl implements Postal{
	
	
	@Autowired
	RestTemplate restTemplate;
	
//	//public List<PostalDetails>fetchPostalDetailsByCity(String cityValue) {
//		//String url="https://api.postalpincode.in/postoffice/"+cityValue;
//		
//		//System.out.println("Url is:"+url);
//		
//		//ResponseEntity<PostalResponse[]>postalResponseEntity=
//			//	restTemplate.getForEntity(url, PostalResponse[].class);
//		
//		//System.out.println("Response is; "+postalResponseEntity.getBody());
//		PostalResponse[] postalResponse = postalResponseEntity.getBody();
//		System.out.println(postalResponse[0].getPostOffice());
//		
//		List<PostalDetails> postalDetails = new ArrayList<PostalDetails>();
//		
//		for(int i=0 ; i< postalResponse[0].getPostOffice().size();i++) {
//			PostalDetails postalSingle = new PostalDetails();
//			postalSingle.setState(postalResponse[0].getPostOffice().get(i).getState());
//			postalSingle.setCountry(postalResponse[0].getPostOffice().get(i).getCountry());
//			postalSingle.setPincode(postalResponse[0].getPostOffice().get(i).getPincode());
//			postalDetails.add(postalSingle);
//		}
//        return postalDetails;
//	}
//	
	
//	public List<PostalUserDetails> fetchPostalUserDetailsByCity(String cityValue) {
//		String url="https://api.postalpincode.in/postoffice/"+cityValue;
//		
//		System.out.println("Url is:"+url);
//		
//		ResponseEntity<PostalResponse[]>postalResponseEntity=
//				restTemplate.getForEntity(url, PostalResponse[].class);
//		
//		System.out.println("Response is; "+postalResponseEntity.getBody());
//		PostalResponse[] postalResponse = postalResponseEntity.getBody();
//		
//		
//		//List<PostalUserDetails> postalUserDetails = new ArrayList<PostalUserDetails>();
//		
//		postalSingle.setMessage(postalResponse[0]);
//        postalSingle.setStatus(postalResponse[0]);
        //System.out.println(postalResponse[0]);
		
//		for(int i=0 ; i< postalResponse[0].getPostOffice().size();i++) {
//			PostalUserDetails postalSingle = new PostalUserDetails();
//			postalSingle.setMessage(postalResponse[0].getPostOffice().get(i).getMessage());
//			postalSingle.setStatus(postalResponse[0].getPostOffice().get(i).getStatus());
//			postalUserDetails.add(postalSingle);
//		}
//        return postalUserDetails;
//		}
	
	public ResponseEntity<PostalResponse[]> fetchPostalUserDetailsByCity(String cityValue) {
		String url="https://api.postalpincode.in/postoffice/"+cityValue;
		
		System.out.println("Url is:"+url);
		
		ResponseEntity<PostalResponse[]>postalResponseEntity=
				restTemplate.getForEntity(url, PostalResponse[].class);
		
		System.out.println("Response Status Code is; "+postalResponseEntity.getBody());
		return postalResponseEntity;
	}

	}


