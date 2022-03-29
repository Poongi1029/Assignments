package com.springSecurity.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springSecurity.Model.User;

public interface UserRepository extends JpaRepository<User, String>{
	public User findByUsername(String username);

}
