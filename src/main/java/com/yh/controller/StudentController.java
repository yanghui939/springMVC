package com.yh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("StudentController运行了");
        return "success";
    }
}
