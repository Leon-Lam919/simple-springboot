// converts the incoming request from the hello class into a Greeting response and returns for the
// client to accept

package com.example.simple_springboot;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@PostMapping("/api/hello")
	@ResponseBody
	public Greeting sendGreetingViaAPI(@RequestBody hello msg) throws Exception {
		if (msg == null || msg == null || msg.getName().isEmpty()) {
			throw new IllegalArgumentException("Name must not be null or empty");
		}
		Thread.sleep(1000);
		return new Greeting("Hello, " + HtmlUtils.htmlEscape(msg.getName()) + "!");
	}
}
