package com.example.simple_springboot;

public class Global_chat {
	private String sender;
	private String message;

	public Global_chat() {}

	public Global_chat(String sender, String message) {
		this.sender = sender;
		this.message = message;
	}

	String getSender() {
		return sender;
	}

	String getMessage() {
		return message;
	}

	void setSender(String sender) {
		this.sender = sender;
	}

	void setMessage(String message){
		this.message = message;
	}
}
