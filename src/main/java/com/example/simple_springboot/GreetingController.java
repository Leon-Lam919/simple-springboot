package com.example.simple_springboot;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {

	@MessageMapping("/hello")
	@SendTo("/topic/greeting")
	public Greeting greeting(hello message) throws Exception {
		if (message == null || message.getName() == null || message.getName().isEmpty()) {
			throw new IllegalArgumentException("Name must not be null or empty");
		}
		Thread.sleep(1000);
		return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
	}

}
