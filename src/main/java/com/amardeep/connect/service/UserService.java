/**
 * This project is created by Amardeep Bhowmick, to demostrate a 
 * a simple social networking application for both web and mobile devices.
 * Copyright ©2016. All rights reserved.
 */
package com.amardeep.connect.service;

import java.util.List;

import com.amardeep.connect.model.Message;
import com.amardeep.connect.model.User;

/**
 * @author Amardeep Bhowmick
 *
 */
public interface UserService {

	public void addFriend(User user);
	
	public void removeFriend(long userId);
	
	public List<User> getAllFriends();
	
	public User getFriend(long userId);
	
	public void updateProfile(User user);
	
	public void deleteProfile(User user);
	
	public void postMessage(Message message);
	
	public void editMessage(Message message);
	
	public void deleteMessage(Message message);
}
