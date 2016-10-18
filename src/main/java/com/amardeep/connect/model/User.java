/**
 * This project is created by Amardeep Bhowmick, to demostrate a 
 * a simple social networking application for both web and mobile devices.
 * Copyright ©2016. All rights reserved.
 */
package com.amardeep.connect.model;

import java.sql.Blob;
import java.util.List;

/**
 * @author Amardeep Bhowmick
 *
 */
public class User {
	
	private long userId;
	private String userName;
	private String userEmail;
	private List<User> friends;
	private Blob userPicture;
	
	public long getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public List<User> getFriends() {
		return friends;
	}
	public void setFriends(List<User> friends) {
		this.friends = friends;
	}
	public Blob getUserPicture() {
		return userPicture;
	}
	public void setUserPicture(Blob userPicture) {
		this.userPicture = userPicture;
	}
	
}
