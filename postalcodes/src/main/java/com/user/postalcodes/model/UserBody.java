package com.user.postalcodes.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserBody {
	@JsonProperty("id")
	private int id;
	
	@JsonProperty("body")
	private String body;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	

}
