package org.bhargav.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
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
	@Produces(MediaType.APPLICATION_JSON)
	public List<message> getMessages(){
		return messageservice.getAllMessages();
	 }
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public message addMessage(message message){
		return messageservice.addMessage(message);
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
		public message updateMessage(@PathParam("messageId") long id, message message){
		message.setId(id);
		return messageservice.updateMessage(message);
	}
	//map to method
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{messageId}")
	public message getMessage(@PathParam("messageId") long id){
		return messageservice.getMessage(id);
	}

} 
