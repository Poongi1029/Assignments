package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//method = RequestMethod.POST
@Controller
public class controller {
    @RequestMapping(path = "/simpleinterest",method = RequestMethod.GET)
    public String simpleInterest(@RequestParam("principal")int principal,
                                 @RequestParam("rate") int rate,
                                 @RequestParam("time")int time,
                                 Model model){
        System.out.println("This is my simple interest page");

        int si = (principal*time*rate)/100;

        model.addAttribute("simpleinterest",si);
        return "simpleinterest";
    }
}
