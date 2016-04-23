package org.bhargav.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.bhargav.messenger.database.DatabaseClass;
import org.bhargav.messenger.model.message;

public class MessageService {
	
	public MessageService(){
		messages.put(1L,new message(1, "Hello" , "Bhargav"));
		messages.put(2L,new message(2,"Holla", "Bhargav"));
		
	}
	private Map<Long, message> messages= DatabaseClass.getMessages();
	
	public List<message> getAllMessages(){
		return new ArrayList<message>(messages.values());
		
	}
		public message getMessage(long id){
			return messages.get(id);
		}
		
		public message addMessage(message message){
			message.setId(messages.size()+1);
			messages.put(message.getId(), message);
			return message;
		}
		
		public message updateMessage(message message){
			if(message.getId()<=0){
				return null;
			}
			messages.put(message.getId(), message);
			return message;
			
		}
		
		public message removeMessage(long id){
			return messages.remove(id);
		}
		
	

}
