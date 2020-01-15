package com.raj.learning.jpa.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raj.learning.jpa.entity.User;

public interface UserRepository  extends JpaRepository<User,Long>{

}
