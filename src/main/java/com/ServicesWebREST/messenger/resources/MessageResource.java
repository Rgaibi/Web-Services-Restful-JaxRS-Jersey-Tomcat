package com.ServicesWebREST.messenger.resources;

import java.util.List;

import com.ServicesWebREST.messenger.model.Message;
import com.ServicesWebREST.messenger.service.MessageService1;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("/messages")
public class MessageResource {
	
	MessageService1 messageservice = new MessageService1();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages() {
		return messageservice.getAllMessages();
	}

}
