package com.example.simple_springboot;

// File used to accept request from the client side


public class chat {
	private String user;
	private String msg;

	public chat() {}

	public chat(String user, String msg) {
		this.user = user;
		this.msg = msg;
	}

	public String getUser() {
		return user;
	}

	public String getMsg() {
		return msg;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
