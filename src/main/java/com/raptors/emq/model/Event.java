package com.raptors.emq.model;


/**
 * @author Sriram Kakani on 2019-07-20
 */

public class Event {

	private Long id;
	private String message;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
