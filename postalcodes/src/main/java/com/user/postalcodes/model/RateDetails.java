package com.user.postalcodes.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RateDetails {
	@JsonProperty("title")
	private String title;
	
	@JsonProperty("image")
	private String image;
	
	@JsonProperty("rate")
	private float rate;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}
	
	}
