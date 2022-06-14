package com.prueba.tecnica.thales.controller;

import com.prueba.tecnica.thales.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping("/hello")
    public String sayHello(Model model){
        System.out.println("Saying hello world Spring Boot...");
        model.addAttribute("messages", "Grating from Local");
        return "hello";
    }

    @RequestMapping("/filter")
    public String filter(Model model){
        System.out.println("Saying hello world Spring Boot...");
        Employee employee = new Employee();
        model.addAttribute("messages", "Grating from Local");
        model.addAttribute("employee", employee);
        return "employee_filter";
    }
}
