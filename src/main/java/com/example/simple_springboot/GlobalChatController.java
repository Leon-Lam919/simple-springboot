package com.example.simple_springboot;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GlobalChatController {
	// Websocket mapping
	@MessageMapping("/send")
	@SendTo("/topic/global")

	public Global_chat broadcastMsgGlobal(chat user) {
		String tester, msg;
		tester = user.getUser();
		msg = user.getMsg();

		return new Global_chat(HtmlUtils.htmlEscape(tester), HtmlUtils.htmlEscape(msg));
	}

	// Rest mapping
	@PostMapping("/api/send")
	@ResponseBody
	public Global_chat sendMsgViaRest(@RequestBody chat user) {
		String tester, msg;
		tester = user.getUser();
		msg = user.getMsg();

		return new Global_chat(HtmlUtils.htmlEscape(tester), HtmlUtils.htmlEscape(msg));
	}

}
