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
	@JsonProperty("userId")
	private int userId;
	
	@JsonProperty("id")
	private int id;
	
	@JsonProperty("title")
	private String title;
	
	@JsonProperty("body")
	private String body;
	
	@JsonProperty("PostalUser")
	private List<UserDetails> postalUser;

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

	public List<UserDetails> getPostalUser() {
		return postalUser;
	}

	public void setPostalUser(List<UserDetails> postalUser) {
		this.postalUser = postalUser;
	}
	
	}

	
	


