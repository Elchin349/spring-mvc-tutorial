package com.company.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 *  @RequestMapping("/app")  burda yazmagimzin sebebi yeni proeyktde butun metodlarin basinda app/....   ondna sonra hansisa path gelecek
 *  asagida processFrom adinda 3 dene ferqli metod yazmisiq birinde sadece helloworld-form faylina gonderir
 *  2 ci metodda versionTwo  HttpServletRequest  den istifade etmisik cunki bir deyer gonderme isteyirikki onu jsp faylinda gostere bilsin
 *  3 cu metodda ise HttpServletRequest dense daya yaxsi versiya olan annotasiyalardan istifade edeceyik: @RequestParam  bu annotasiya
 *  bizim 2ci metodda yazdigimizi qisa sekilde hell edir. model.addAtribute()  ise iceriye nece bir melumat atacaqsansa onu qeyd edib jsp faylinda atributun
 *  adiyla cagirirsan , meselen message yazmisansa ${message} kimi cagirrisan
 *
 */
@Controller
@RequestMapping("/app")
public class HelloWorldController {

    @RequestMapping("/show-form")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/process-form")
    public String processForm(){
        return "helloworld";
    }

    @RequestMapping("/process-from-v2")
    public String processFromVersionTwo(HttpServletRequest request, Model model){
        String name = request.getParameter("studentName");

        name = name.toUpperCase();

        String result = "Hello " + name;
        model.addAttribute("message",result);
        return "helloworld";
    }

    @RequestMapping("/process-form-v3")
    public String processFormVersionThree(@RequestParam("studentName")String name, Model model){
        name = name.toUpperCase();
        String result = "Hey how are you " + name;

        model.addAttribute("message",result);
        return "helloworld";
    }



}
