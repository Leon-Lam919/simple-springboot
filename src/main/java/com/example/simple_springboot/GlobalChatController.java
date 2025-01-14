package com.example.simple_springboot;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GlobalChatController {
	@SendTo("/topic/global")
	@MessageMapping("/send")

	public Global_chat broadcastMsgGlobal(Global_chat msg) {
		return new Global_chat(HtmlUtils.htmlEscape(msg.getSender()),
				HtmlUtils.htmlEscape(msg.getSender()));
	}
}
