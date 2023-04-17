package com.user.postalcodes.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenarationDetails {
	
	@JsonProperty("count")
	private int count;
	
	@JsonProperty("next")
	private String next;
	
	@JsonProperty("previous")
	private String previous;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}

	public String getPrevious() {
		return previous;
	}

	public void setPrevious(String previous) {
		this.previous = previous;
	}
	@JsonProperty("results")
	private List<Results> Results;

	public List<Results> getResults() {
		return Results;
	}

	public void setResults(List<Results> results) {
		Results = results;
	}
	

	}

	
	
	
	
	
	


