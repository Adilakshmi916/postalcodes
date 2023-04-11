package com.user.postalcodes.serviceImpl;



import java.util.List;

import org.springframework.http.ResponseEntity;


import com.user.postalcodes.method.PostalDetails;
import com.user.postalcodes.response.PostalResponse;



public interface Postal {
	List<PostalDetails> fetchPostalDetailsByCity(String cityValue);

}
