/**
 * This project is created by Amardeep Bhowmick, to demostrate a 
 * a simple social networking application for both web and mobile devices.
 * Copyright ©2016. All rights reserved.
 */
package com.amardeep.connect.service;

import com.amardeep.connect.dto.RegistrationDto;
import com.amardeep.connect.model.User;

/**
 * @author Amardeep Bhowmick
 *
 */
public interface RegistrationService {

	public User register(RegistrationDto registrationDto);
}
