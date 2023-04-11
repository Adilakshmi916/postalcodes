package com.user.postalcodes.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostalResponse {
	@JsonProperty("Message")
	private String message;
	
	@JsonProperty("Status")
	private String status;
	
	@JsonProperty("PostOffice")
	private List<PostalUserDetails> postOffice;

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

	public List<PostalUserDetails> getPostOffice() {
		return postOffice;
	}

	public void setPostOffice(List<PostalUserDetails> postOffice) {
		this.postOffice = postOffice;
	}

	
	}

	
	


