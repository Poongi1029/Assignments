package com.springSecurity.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springSecurity.Model.User;
import com.springSecurity.Service.Service;

@RestController
@RequestMapping("/ghai")
//@EnableGlobalMethodSecurity
public class MainController {
	@Autowired
	Service service;
	
	@GetMapping("/User")
	public List<User>findall()
	{
		return service.findall();
	}
	//@PreAuthorize("hasRole(ADMIN)")
	@GetMapping("/User/{username}")
	public User findByUsername(@PathVariable("username") String username)
	{
		return service.findByUsername(username);
	}
	
	@PostMapping("/User")
	public User add(@RequestBody User user)
	{
		return service.add(user);
	}
	

}
