package com.user.postalcodes.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostalDetails {
	@JsonProperty("State")
	public String state;
	
	@JsonProperty("Country")
	public String country;
	
	@JsonProperty("Pincode")
	public String pincode;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	
    }

	
	
	


