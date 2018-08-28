package com.hwangd.feh.messenger.service;

import java.util.ArrayList;
import java.util.List;

import com.hwangd.feh.messenger.model.Message;

public class MessageService {
	public List<Message> getAllMessages() {
		Message m1 = new Message(1L, "Hello", "me");
		Message m2 = new Message(2L, "Hi", "you");
		
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
	}
}
