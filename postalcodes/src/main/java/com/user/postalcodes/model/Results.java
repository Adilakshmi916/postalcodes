package com.user.postalcodes.model;



import com.fasterxml.jackson.annotation.JsonProperty;

public class Results {
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("url")
	private String url;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	}
