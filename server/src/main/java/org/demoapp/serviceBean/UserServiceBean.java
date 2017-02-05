package org.demoapp.serviceBean;

import org.demoapp.Repository.UserRepository;
import org.demoapp.model.Users;
import org.demoapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceBean implements UserService{
	
	@Autowired
	private UserRepository signuprepository;
	
	@Override
	public Users sigupUser(String username, String password, String emailid){
		
		Users users = new Users();
		users.setUsername(username);
		users.setPassword(password);
		users.setEmailid(emailid);
		return signuprepository.save(users);
	}

}
