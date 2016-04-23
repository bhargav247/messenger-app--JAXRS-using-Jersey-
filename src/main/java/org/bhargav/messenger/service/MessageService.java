package org.bhargav.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.bhargav.messenger.model.message;

public class MessageService {
	
	public List<message> getAllMessages(){
		message m1= new message(1L,"Hello World!","Bhargav");
		message m2= new message(2L,"Hi", "Bhargav");
		List<message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
		
		
	}

}
