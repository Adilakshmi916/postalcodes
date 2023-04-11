package com.user.postalcodes.service;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.user.postalcodes.model.PostalResponse;
import com.user.postalcodes.model.PostalUserDetails;


public interface Postal {
	ResponseEntity<PostalResponse[]> fetchPostalUserDetailsByCity(String cityValue);

}
