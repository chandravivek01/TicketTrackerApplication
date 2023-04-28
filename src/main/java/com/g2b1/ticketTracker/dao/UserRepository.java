package com.g2b1.ticketTracker.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.g2b1.ticketTracker.entity.User;


public interface UserRepository extends JpaRepository<User, Long>{

	public User findByUsername(String username);
}
