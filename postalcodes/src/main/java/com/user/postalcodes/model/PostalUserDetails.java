package com.user.postalcodes.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostalUserDetails {
	@JsonProperty("Message")
	private String message;
	
	@JsonProperty("Status")
	private String status;

	public String getMessage() {
		return message;
	}

	public void setMessage(String postalResponse) {
		this.message = postalResponse;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	}
