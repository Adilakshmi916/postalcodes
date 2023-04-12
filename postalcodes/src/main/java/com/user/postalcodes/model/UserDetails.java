package com.user.postalcodes.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDetails {
	@JsonProperty("userId")
	private int userId;
	
	@JsonProperty("id")
	public int id;
	
	@JsonProperty("title")
	public String title;
	
	@JsonProperty("body")
	public String body;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	

}
