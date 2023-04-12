package com.user.postalcodes.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserTitle {
	@JsonProperty("userId")
	private int userId;
	
	@JsonProperty("title")
	private String title;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	

}
