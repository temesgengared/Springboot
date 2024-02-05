package com.lemlem.restaurant;

import java.util.Date;

import lombok.Data;

@Data
public class ErrorDetails {
	private Date timestamp;
	private String message;
	private String details;
	
	public ErrorDetails(Date timesstamp,String message,String details) {
	this.setTimestamp(timesstamp);
	this.setMessage(message);
	this.setDetails(details);
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	

}
