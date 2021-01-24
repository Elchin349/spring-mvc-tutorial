package com.company.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/hello")
    public String hello(ModelMap map) {
        map.put("message", "Hello. Welcome to Spring MVC Lesson");
        return "hello";  //  buda yazdigimiz hello  bir jsp fayldir, adlar ferqli olsa istediyiniz netice elde olunmuyacaq
    }

    @RequestMapping("/bye")
    public String bye(ModelMap modelMap) {
        modelMap.put("message", "GOOD BYE");
        return "bye";
    }
}
