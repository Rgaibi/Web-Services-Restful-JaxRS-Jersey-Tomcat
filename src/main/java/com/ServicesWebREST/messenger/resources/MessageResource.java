package com.ServicesWebREST.messenger.resources;

import java.util.List;

import com.ServicesWebREST.messenger.model.Message;
import com.ServicesWebREST.messenger.service.MessageService;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("/messages")
public class MessageResource {
	
	MessageService messageservice = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages() {
		return messageservice.getAllMesages();
	}

}
