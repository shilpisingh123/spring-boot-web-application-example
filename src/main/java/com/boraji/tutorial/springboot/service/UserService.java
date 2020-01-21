package com.boraji.tutorial.springboot.service;

import com.boraji.tutorial.springboot.model.Login;
import com.boraji.tutorial.springboot.model.User;

public interface UserService {

	User validateUser(Login login);

	void register(User user);

}
