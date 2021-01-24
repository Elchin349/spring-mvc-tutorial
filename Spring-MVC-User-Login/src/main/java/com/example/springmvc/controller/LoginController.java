package com.example.springmvc.controller;

import com.example.springmvc.model.Login;
import com.example.springmvc.model.User;
import com.example.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * LoginController de yazmis oldugumuz metodlarda gorduyunuz kimi bir dene Login classi yaratmisiq , frontdan aldigimiz deyerler bu loginin icine dusur
 * ve biz userservice muraciet ederek bele bir loginin olub olmadigini bazadan yoxluyuruq, eger varsa bizi 'welcome.jsp' gaylina yonlendirir
 * eger yanlisdirsa tekrar login faylina donur
 *
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/login-process")
    public String login(@ModelAttribute("login")Login login, ModelMap model){
        User user = userService.validateUser(login);

        boolean isValidUser = false;

        if(null != user && user.getUsername().equals(login.getUsername())
        && user.getPassword().equals(login.getPassword())){
            isValidUser = true;
            model.addAttribute("username",user.getUsername());
        }
        return isValidUser ? "welcome" : "login";
    }
}
