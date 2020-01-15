package com.raj.learning.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.raj.learning.jpa.entity.User;
import com.raj.learning.jpa.service.UserDAOService;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner{
	
	private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	
	@Autowired
	private UserDAOService userDaoService;

	@Override
	public void run(String... args) throws Exception {
		 User user = new User("Raj", "Admin");
		 userDaoService.insert(user);
		 
		 log.info("User is created: "+user);
		
	}

	
}
