package com.user.postalcodes.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.user.postalcodes.method.PostalDetails;
import com.user.postalcodes.response.PostalResponse;

@Service
public class PostalServiceImpl implements Postal{
	
	
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

	
}
