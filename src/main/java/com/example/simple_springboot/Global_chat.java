// Used as a response from the server side to client side

package com.example.simple_springboot;

public class Global_chat {
	private String sender;

	public Global_chat() {}

	public Global_chat(String sender) {
		this.sender = sender;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

}
