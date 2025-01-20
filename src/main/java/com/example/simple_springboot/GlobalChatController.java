package com.example.simple_springboot;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

// NOTE: takes in a client side request of user & msg to return it as a single value, broadcasted to
// all users subbed to general chat

@Controller
public class GlobalChatController {
	// Websocket mapping
	@MessageMapping("/send")
	@SendTo("/topic/global")
	public Global_chat broadcastMsgGlobal(chat user) throws Exception {
		String tester, msg, sendMsg;
		tester = user.getUser();
		msg = user.getMsg();
		if (tester == null || tester == "" || msg == null || msg == "") {
			throw new IllegalArgumentException("user or msg cannot be null or empty");
		}
		sendMsg = tester + ": " + msg;

		return new Global_chat(HtmlUtils.htmlEscape(sendMsg));
	}

	// Rest mapping
	@PostMapping("/api/send")
	@ResponseBody
	public Global_chat sendMsgViaRest(@RequestBody chat user) throws Exception {
		String tester, msg, sendMsg;
		tester = user.getUser();
		msg = user.getMsg();
		if (tester == null || tester == "" || msg == null || msg == "") {
			throw new IllegalArgumentException("user or msg cannot be null or empty");
		}

		sendMsg = tester + ": " + msg;

		return new Global_chat(HtmlUtils.htmlEscape(sendMsg));
	}

}
