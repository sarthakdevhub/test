package com.app.Model;

public class OutputDTO {
	
	String title;
	String description;
	
	
	
	public OutputDTO(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "OutputDTO [title=" + title + ", description=" + description + "]";
	}
	
	
}
