package com.hwangd.feh.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.hwangd.feh.messenger.model.Message;
import com.hwangd.feh.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {
	MessageService messageService = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages() {
		return messageService.getAllMessages();
	}
}
