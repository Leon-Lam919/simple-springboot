// This file is used to accept the request of a name from the client side
package com.example.simple_springboot;

public class hello {
	private String name;

	public hello() {}

	public hello(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
