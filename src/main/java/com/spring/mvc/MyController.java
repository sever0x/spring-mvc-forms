package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/")
    public String mainPage() {
        return "main-page";
    }

    @RequestMapping("/add")
    public String addEmployeePage(Model model) {
        model.addAttribute("employee", new Employee());
        return "add-employee";
    }

    @RequestMapping("/show")
    public String showEmployeePage(@ModelAttribute("employee") Employee employee) {
        return "show-employee";
    }
}
