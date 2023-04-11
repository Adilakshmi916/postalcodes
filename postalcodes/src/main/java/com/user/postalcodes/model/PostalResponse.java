package com.user.postalcodes.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostalResponse {
	@JsonProperty("Message")
	private String message;
	
	@JsonProperty("Status")
	private String status;
	
	@JsonProperty("PostOffice")
	private List<PostalDetails> postOffice;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<PostalDetails> getPostOffice() {
		return postOffice;
	}

	public void setPostOffice(List<PostalDetails> postOffice) {
		this.postOffice = postOffice;
	}

	public List<PostalDetails> getPostalResponse() {
		// TODO Auto-generated method stub
		return getPostalResponse();
	}

	
	

}
