package org.bhargav.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.bhargav.messenger.model.Profile;
import org.bhargav.messenger.model.message;

public class DatabaseClass {
	
	private static Map<Long, message> messages = new HashMap<>();
	private static Map<Long, Profile> profiles= new HashMap<>();
	
	public static Map<Long,message> getMessages(){
		return messages;
}
	public static Map<Long, Profile> getProfiles(){
		return profiles;
	}
	
	}

