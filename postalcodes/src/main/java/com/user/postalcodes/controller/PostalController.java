package com.user.postalcodes.controller;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.user.postalcodes.method.PostalDetails;
import com.user.postalcodes.serviceImpl.PostalServiceImpl;

@RestController
@RequestMapping("/postal")

public class PostalController {

	Logger logger = LoggerFactory.getLogger(PostalController.class);

	@Autowired(required=true)
	PostalServiceImpl postalServiceImpl;
   
   
   @GetMapping(value = "/City")
   
   public List<PostalDetails> getSome(@RequestParam("cityname") String cityName) {
	   logger.info("The City Name in getPostalCity is {}", cityName);
      //return ResponseEntity.status(HttpStatus.OK).body(postOfficeServiceImpl.fetchPostOfficeDetailsByCity(cityName));
  return postalServiceImpl.fetchPostalDetailsByCity(cityName);

}
}