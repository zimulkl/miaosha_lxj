package com.lxj.controller;

import com.lxj.domin.User;
import com.lxj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.transform.Result;

@Controller
@RequestMapping("/demo")

public class SampleController {
    @Autowired
    UserService userService;

    @RequestMapping("/thymeleaf")
    public String thymeleaf(Model model){
        model.addAttribute("name","lxj");
        return "hello";
    }

    @RequestMapping("/db/get")
    @ResponseBody
    public String dbget(){
        User user = userService.getByid(1);
        System.out.println(user.getName());
        return user.getName();
    }
}
