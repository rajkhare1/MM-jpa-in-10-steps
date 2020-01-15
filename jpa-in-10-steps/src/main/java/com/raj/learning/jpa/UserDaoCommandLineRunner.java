package com.raj.learning.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.raj.learning.jpa.entity.User;
import com.raj.learning.jpa.service.UserRepository;

@Component
public class UserDaoCommandLineRunner implements CommandLineRunner{
	
	private static final Logger log = LoggerFactory.getLogger(UserDaoCommandLineRunner.class);
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		 User user = new User("Richa", "Admin");
		 userRepository.save(user);
		 
		 log.info("User is created: "+user);
		
	}

	
}
