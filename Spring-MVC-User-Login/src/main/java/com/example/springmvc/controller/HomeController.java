package com.example.springmvc.controller;

import com.example.springmvc.model.Login;
import com.example.springmvc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * User login deye bir proyekt isdiyeceyik tebiiki burda biz gorusune deyil sadece
 * proses nece gedir ona baxaceyiq
 * HomeController de 3 dene metod yaradiram 1ci metod home bizi home.jsp faylina yonlendirir ve ordanda bize
 * asagida gorduyumuz metodlari link seklinde ekranda bize gosterir ve sen secimini edende hansi linkin uzerine klikleyirsense
 * hemin fayla gedir, misal deyekki login linkine klikledin seni loin.jsp faylina yonledirir
 * Ve LoginController vasitesi ile proses bas verir ,ardini LoginControlelrde oxu
 *
 * RegistrationControllerde eyni ile Login kimi calisir
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/show-login-page")
    public String showLoginPage(Model modelMap) {
        modelMap.addAttribute("login",new Login());
        return "login";
    }

    @GetMapping("/show-registration-page")
    public String showRegistrationPage(Model modelMap) {
        modelMap.addAttribute("user",new User());
        return "registration";
    }

}
