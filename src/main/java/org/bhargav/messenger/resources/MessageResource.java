package org.bhargav.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.bhargav.messenger.model.message;
import org.bhargav.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {
	
	MessageService messageservice= new MessageService();
	
	//mapped to class
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<message> getMessages(){
		return messageservice.getAllMessages();
	 }
	
	//map to method
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/{messageId}")
	public message getMessage(@PathParam("messageId") long id){
		return messageservice.getMessage(id);
	}

} 
