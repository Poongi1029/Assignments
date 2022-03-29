package com.springSecurity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@RequestMapping("/")
	public String hello()
	{
		return "<h1>Welcome</h1>";
	}
	
	@RequestMapping("/User")
	public String User()
	{
		return "<h1>Welcome User</h1>";
	}
	
	@RequestMapping("/admin")
	public String Admin()
	{
		return "<h1>Welcome Admin</h1>";
	}

}
