package com.user.postalcodes.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rating{
	
	//@JsonProperty("rate")
	 private float rate;
	
	//@JsonProperty("count")
	 private int count;

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	}


