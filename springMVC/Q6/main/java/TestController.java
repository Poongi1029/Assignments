package com.springq6;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	 @RequestMapping(value = "/registration", method = RequestMethod.GET)
	    public ModelAndView registrationForm() {
	        ModelAndView modelAndView = new ModelAndView("registration");
	        return modelAndView;

	    }
	    @RequestMapping(value = "/validation", method = RequestMethod.POST)
	    public ModelAndView formValidation(@Valid @ModelAttribute("customer")Customer customer1, BindingResult bindingResult) {
	        if(bindingResult.hasErrors()) {
	            System.out.println("inside");
	            ModelAndView modelAndView = new ModelAndView("registration");
	            return modelAndView;
	        }
	        ModelAndView modelAndView = new ModelAndView("test");
	        modelAndView.addObject("msg",customer1);
	        return modelAndView;
	    }
}
