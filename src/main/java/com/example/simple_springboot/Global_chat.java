// Used as a response from the server side to client side

package com.example.simple_springboot;

public class Global_chat {
	private String sender;
	private String message;

	public Global_chat() {}

	public Global_chat(String sender, String message) {
		this.sender = sender;
		this.message = message;
	}

	public String getSender() {
		return sender;
	}

	public String getMessage() {
		return message;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
