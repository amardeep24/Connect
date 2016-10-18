/**
 * This project is created by Amardeep Bhowmick, to demostrate a 
 * a simple social networking application for both web and mobile devices.
 * Copyright ©2016. All rights reserved.
 */
package com.amardeep.connect.model;

import java.sql.Blob;

/**
 * @author Amardeep Bhowmick
 *
 */
public class Message {
	private String message;
	private long messageId;
	private Blob messageImage;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public long getMessageId() {
		return messageId;
	}
	public void setMessageId(long messageId) {
		this.messageId = messageId;
	}
	public Blob getMessageImage() {
		return messageImage;
	}
	public void setMessageImage(Blob messageImage) {
		this.messageImage = messageImage;
	}

}
