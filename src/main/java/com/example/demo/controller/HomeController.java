package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@CrossOrigin(origins = "http://localhost:8000")
public class HomeController {
    
    @GetMapping("/")
    public ModelAndView loadHomePage(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("Home");
    }
}