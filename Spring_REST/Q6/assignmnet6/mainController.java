package com.springboot.assignmnet6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {
	
	@Autowired
	Service service;
	
	@RequestMapping("/add/{c}")
	public int Addition(@PathVariable("c") int c)
	{
		return service.Addition(10, 20);
	}
	

	@RequestMapping("/sub/{c}")
	public int Subtraction(@PathVariable("c") int c)
	{
		return service.Subtraction(70,50);
	}
	

	@RequestMapping("/mul/{c}")
	public int Multiplication(@PathVariable("c") int c)
	{
		return service.Multiplication(20,10);
	}
	

	@RequestMapping("/div/{c}")
	public int Division(@PathVariable("c") int c)
	{
		return service.division(20,10);
	}


}
