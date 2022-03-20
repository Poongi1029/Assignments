package com.springboot.assignmnet2;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class UserService
{
	public String validate(String username,String Password)
	{
        if (username.equals("Poonguzhali") && Password.equals("Hema"))
        {
            return "Valid User";
        }
        else
        {
        	return "Invalid User";
        }
    }

}
