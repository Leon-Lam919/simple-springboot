package com.example.simple_springboot;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class GlobalChatController {
	@SendTo("/topic/global")
	@MessageMapping("/send")

	public Global_chat broadcastMsgGlobal(Global_chat globalMSG, Global_chat name) {
		return globalMSG;
	}
}
