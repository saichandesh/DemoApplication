package org.demoapp.controller;

import org.apache.log4j.Logger;
import org.demoapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.demoapp.model.Response;
import org.demoapp.model.Users;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private Response response;
	
	static final Logger logger = Logger.getLogger(UserController.class);
	
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public ResponseEntity<?> signup(@RequestParam String username, String password, String emailid){
		
		Users user;
		
		try{
			user = userService.sigupUser(username,password,emailid);
			System.out.println(user);
		}
		catch(Exception e){
			return response.respond("error");
		}
		
		return response.respond("created");
		
	}

}
