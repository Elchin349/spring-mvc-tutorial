package com.company.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Bu defeki spring proyektimizi maven web arxitekturasi ile yaradiram
 * ve jar fayl deyil maveinin icerisinde dependencyleri yaziram
 */

@Controller
public class HomeController {

    /**
     * ModelAndView Spring de bir web classdir
     *
     * @return
     */
    @RequestMapping("/hello")
    public ModelAndView home() {
        return new ModelAndView("welcome", "message", "Welcome to Spring MVC");
    }
}
