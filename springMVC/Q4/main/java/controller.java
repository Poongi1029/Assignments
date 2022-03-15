package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Controller
public class controller {

    Map<String,String> users = new HashMap<>();
    @RequestMapping(path = "/loginsuccess",method = RequestMethod.POST)
    public ModelAndView login(@RequestParam("username")String username, @RequestParam("password")String password){
        ModelAndView modelAndView = new ModelAndView();
        for(Map.Entry<String,String> entry : users.entrySet()){
            if(Objects.equals(entry.getKey(), username) && Objects.equals(entry.getValue(), password)){
                modelAndView.setViewName("loginsuccess");
                return modelAndView;
            }
        }
        modelAndView.setViewName("error");
        return modelAndView;
    }

    @RequestMapping(path="/success",method=RequestMethod.POST)
    public ModelAndView success(@RequestParam("username")String username, @RequestParam("password")String password,
                          @RequestParam("username")String email){
        ModelAndView modelAndView = new ModelAndView();
        UserModel userModel = new UserModel();
        userModel.setUsername(username);
        userModel.setEmail(email);
        userModel.setPassword(password);

        users.put(userModel.getUsername(),userModel.getPassword());
        modelAndView.addObject("user",userModel);
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/error")
    public String error(){
        return "error";
    }

    @RequestMapping("/login")
    public String login1(){
        return "login1";
    }
}
