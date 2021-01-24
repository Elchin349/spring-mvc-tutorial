package com.company.springmvc.controller;

import com.company.springmvc.bean.Student;
import com.company.springmvc.util.FakeDataBAse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("app/")
public class StudentController {

    @GetMapping("/show-form")
    public String showForm(Model model){
        Student student = new Student();
        model.addAttribute("student",student);
        return "student-form";
    }

    // al hazirda sadece frontdan aldigimiz melumatlari student-confirmation yonlendiririk
    // amma sonraki proseslerde evelce servisler yaradib bunu bazaya kocurdeceyik
    @PostMapping("/process-form")
    public String processForm(@ModelAttribute("student")Student student){
        return "student-confirmation";
    }

    //  FakeDatabse deye bir sey duzeldecem ve sanki bazadan butun telebelerin melumatini ekranda cixardacam
    @GetMapping("/find-all")
    public String getStudents(Model model){
        List<Student> studentList = FakeDataBAse.getAllStudents();
        model.addAttribute("studentList",studentList);
        return "student-list";
    }
}
