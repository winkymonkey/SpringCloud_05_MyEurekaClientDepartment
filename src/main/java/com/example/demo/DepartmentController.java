package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
	
	@RequestMapping("/initDepartment/{id}")
    public String greeting(@PathVariable int id) {
        return "I am DepartmentController"+"---id="+id;
    }
}
