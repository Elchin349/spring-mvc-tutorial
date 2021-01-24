package com.company.springmvc.controller;

import com.company.springmvc.MapValidationErrorService;
import com.company.springmvc.bean.Student;
import com.company.springmvc.util.FakeDataBAse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("app/")
public class StudentController {

    @Autowired
    private MapValidationErrorService errorService;

    @GetMapping("/show-form")
    public String showForm(Model model){
        Student student = new Student();
        model.addAttribute("student",student);
        return "student-form";
    }
    // indi ise exception lar elave edeceyik
    @PostMapping("/process-form")
    public String processForm(@Valid @ModelAttribute("student")Student student, BindingResult bindingResult){


        String error = errorService.MapValidationService(bindingResult);
        if(error != null){
            return "student-form";
        }
        return "student-confirmation";
    }

    @GetMapping("/find-all")
    public String getStudents(Model model){
        List<Student> studentList = FakeDataBAse.getAllStudents();
        model.addAttribute("studentList",studentList);
        return "student-list";
    }
}
