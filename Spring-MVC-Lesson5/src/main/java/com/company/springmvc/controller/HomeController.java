package com.company.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    /**
     * @Controller annotasiyasini qoyduqdan sonra yazdiginiz metodun basinda RequestMapping ve ya GetMapping
     * Ve ya PostMApping yazaraq metodudunuz hansi tipde oldugunu gosterirsiz
     * eger her hansisa melumat alirsizsa get metodu lazimdi yox eger hansi melumatari bazaya kocurmek isteyirsizse
     * bu zaman post metoduna ehtiyac vardir
     * Asagidan return de yazdigimiz jsp faylinin adidir
     */
    @GetMapping
    public String homePage(){
        return "main-menu";
    }

}
