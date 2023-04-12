package com.user.postalcodes.service;


import java.util.List;

import org.springframework.http.ResponseEntity;


import com.user.postalcodes.model.PostalDetails;
import com.user.postalcodes.model.PostalResponse;
import com.user.postalcodes.model.ProductDetails;
import com.user.postalcodes.model.UserBody;
import com.user.postalcodes.model.UserDetails;



public interface Postal {
	List<PostalDetails>fetchPostalDetailsByCity(String cityValue);
	public UserDetails fetchUserDetailsById(int id);
	public UserBody fetchUserBodiesById(int id);
	public ProductDetails fetchProductDetailsById(int num);


}
