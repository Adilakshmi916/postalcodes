package com.user.postalcodes.controller;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.user.postalcodes.model.PostalDetails;
import com.user.postalcodes.model.PostalResponse;
import com.user.postalcodes.model.PostalUserDetails;
import com.user.postalcodes.model.ProductDetails;
import com.user.postalcodes.model.UserBody;
import com.user.postalcodes.model.UserDetails;
import com.user.postalcodes.model.UserTitle;
import com.user.postalcodes.service.PostalServiceImpl;

@RestController
@RequestMapping("/postal")

public class PostalController {

	Logger logger = LoggerFactory.getLogger(PostalController.class);

	@Autowired(required=true)
	PostalServiceImpl postalServiceImpl;
   
   
   @GetMapping(value = "/City")
   
   public ResponseEntity<List<PostalDetails>> getSome(@RequestParam("cityname") String cityName) {
	   logger.info("The City Name in getPostalCity is {}", cityName);
      return ResponseEntity.status(HttpStatus.OK).body(postalServiceImpl.fetchPostalDetailsByCity(cityName));
      // return postalServiceImpl.fetchPostalDetailsByCity(cityName);

}

//@GetMapping(value = "/getcity")
//   
//   public ResponseEntity<List<UserDetails>> getValue(@RequestParam("cityname") String cityName) {
//	   logger.info("The City Name in getPostalCity is {}", cityName);
//      return ResponseEntity.status(HttpStatus.OK).body(postalServiceImpl.fetchPostalDetailsByCity(cityName));
//   
//}
    @GetMapping(value = "/typicode")
     public ResponseEntity<UserDetails>getUser(@RequestParam("id")int id){
	 //logger.info("user details is {}", posts);
     return ResponseEntity.status(HttpStatus.OK).body(postalServiceImpl.fetchUserDetailsById(id));
}
    @GetMapping(value = "/gettypicode")
    public ResponseEntity<UserTitle>getTitle(@RequestParam("id")int id){
    return ResponseEntity.status(HttpStatus.OK).body(postalServiceImpl.fetchUserTitlesById(id));
    }
    @GetMapping(value = "/bytypicode")
    public ResponseEntity<UserBody>getBody(@RequestParam("id")int id){
    return ResponseEntity.status(HttpStatus.OK).body(postalServiceImpl.fetchUserBodiesById(id));
    
    }
    @GetMapping(value = "/products")
    public ResponseEntity<ProductDetails>getProduct(@RequestParam("num")int num){
	 //logger.info("user details is {}", posts);
    return ResponseEntity.status(HttpStatus.OK).body(postalServiceImpl.fetchProductDetailsById(num));
    
}
}


