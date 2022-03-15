package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controller {

    @RequestMapping(path = "/login",method = RequestMethod.GET)
    public ModelAndView login(@RequestParam("username")String username, @RequestParam("password")String password){
        UserModel userModel = new UserModel();
        userModel.setEmail("123@gmail.com");
        userModel.setUsername("pong");
        userModel.setPassword("pong");

        if(username.equals(userModel.getUsername()) && password.equals(userModel.getPassword())){
            ModelAndView modelAndView =  new ModelAndView("success");
            modelAndView.addObject("user",userModel);
            return modelAndView;

        }
        else {
            return new ModelAndView("error");
        }
    }
}
