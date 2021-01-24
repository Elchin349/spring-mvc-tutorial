package com.example.springmvc.controller;

import com.example.springmvc.model.User;
import com.example.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    @Autowired
    private UserService userService;

    @PostMapping("/registration-form")
    public String addUser(@ModelAttribute("user")User user, ModelMap modelMap){
        userService.addUser(user);
        modelMap.addAttribute("username",user.getUsername());
        return "welcome";
    }
}
