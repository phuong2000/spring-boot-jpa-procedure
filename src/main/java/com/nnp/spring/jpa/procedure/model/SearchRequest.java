package com.nnp.spring.jpa.procedure.model;

public class SearchRequest {
	 private String title;
	 
	 public SearchRequest() {
		 
	 }
	 
	 public SearchRequest(String title) {
	        this.title = title;
	 }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "SearchRequest [title=" + title + "]";
	}
	 
	
}
