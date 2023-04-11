package com.user.postalcodes.service;



import java.util.List;

import org.springframework.http.ResponseEntity;

import com.user.postalcodes.model.PostalDetails;
import com.user.postalcodes.model.PostalResponse;



public interface Postal {
	List<PostalDetails> fetchPostalDetailsByCity(String cityValue);

}
