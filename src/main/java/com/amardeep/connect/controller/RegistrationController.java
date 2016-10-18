/**
 * This project is created by Amardeep Bhowmick, to demostrate a 
 * a simple social networking application for both web and mobile devices.
 * Copyright ©2016. All rights reserved.
 */
package com.amardeep.connect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.amardeep.connect.dto.RegistrationDto;
import com.amardeep.connect.dto.Status;
import com.amardeep.connect.service.RegistrationService;

/**
 * @author Amardeep Bhowmick
 *
 */
@RestController
public class RegistrationController {

	@Autowired 
	RegistrationService registrationService;
	
	public Status register(RegistrationDto registrationDto) {
			registrationService.register(registrationDto);
	}

}
