package com.example.simple_springboot;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GlobalChatController {
	@MessageMapping("/send")
	@SendTo("/topic/global")

	public Global_chat broadcastMsgGlobal(chat user) {
		return new Global_chat("Hello: " + HtmlUtils.htmlEscape(user.getUser()),
				HtmlUtils.htmlEscape(user.getMsg()));
	}
}
