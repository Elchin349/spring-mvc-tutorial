package com.company.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// mvc - info faylini oxuyun
@Controller
public class HomeController {

    @RequestMapping("/")
    public String homePage() {
        return "home-page";
    }
}
