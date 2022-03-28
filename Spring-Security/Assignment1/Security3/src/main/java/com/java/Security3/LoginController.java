package com.java.Security3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LoginController {
	
	@RequestMapping(value ={"/","/login"}, method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("errorMsg", "Your username and password are invalid.");

        if (logout != null)
            model.addAttribute("msg", "You have been logged out successfully.");

        return "login";
    }
	
	 @RequestMapping(value = "/failure")
	    public String failure(Model model){
	        
			int limit =0;
				limit++;
				if(limit==3)
	        	{
		            limit=0;
		            model.addAttribute("msg","limit exceeded");
		           return "failure";

	        	}
	        model.addAttribute("LoginError","error");
	        return "login";
	    }
}
