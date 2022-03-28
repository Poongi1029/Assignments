package com.java.Security3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/home")
    public String Home(){
        return "Welcome to home page";
    }

    @GetMapping("/user")
    public  String getUser(){
        return "Welcome user";
    }

    @GetMapping("/admin")
    public String getAdmin(){
        return "Welcome admin";
    }
}
