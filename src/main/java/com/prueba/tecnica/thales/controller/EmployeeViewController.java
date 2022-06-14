package com.prueba.tecnica.thales.controller;

import com.prueba.tecnica.thales.model.Employee;
import com.prueba.tecnica.thales.service.EmployeeService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@AllArgsConstructor
public class EmployeeViewController {

    private static final Logger LOG = LoggerFactory.getLogger(EmployeeViewController.class);

    private EmployeeService service;

    @PostMapping("/findById")
    //@RequestMapping(value = "/findById", method = RequestMethod.POST)
    public String findByEmployeeId(@ModelAttribute("employee") Employee employee){
        service.findById(employee);
        return "index";
    }

    public ModelAndView saluda(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("Titulo", "Tutoriales Spring MVC");
        mv.addObject("mensaje", "MI primera Aplicación Web Spring MVC");
        mv.addObject("hello", "Hello");
        return mv;
    }

}
