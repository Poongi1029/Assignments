package com.springSecurity.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public/")
public class HomeController {
	

	@RequestMapping("/home")
	public String home()
	{
		return "<h1>This is home page </h1>";
	}
	

	@RequestMapping("/login")
	public String login()
	{
		return "<h1>This is Login page </h1>";
	}
	
}
