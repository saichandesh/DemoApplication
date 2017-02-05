package org.demoapp.service;

import org.demoapp.model.Users;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

	public Users sigupUser(String username, String password, String emailid);
}
