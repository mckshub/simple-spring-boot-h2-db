package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.Role;
import com.example.demo.repository.RoleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:9080")
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleRepository repository;

    @GetMapping(value="/getAllRoles", produces = "application/json")
    public @ResponseBody List<Role> getAllRoles() {
        return (List<Role>) repository.findAll(); 
    }
    
}