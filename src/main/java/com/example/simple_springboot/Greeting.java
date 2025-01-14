// This file is used to return the response to the client from the server side
package com.example.simple_springboot;

public class Greeting {
	private String content;

	// contructor
	public Greeting() {}

	public Greeting(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}
}
