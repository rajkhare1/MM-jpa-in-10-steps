package com.raj.learning.jpa.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.raj.learning.jpa.entity.User;

@Repository
@Transactional
public class UserDAOService {
	//By EntityManager i would able to save Entity into database
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public long insert(User user) {
		entityManager.persist(user);
		return user.getId();
	}
	

}
