package com.nikodev.myadminproject.controller;

import com.nikodev.myadminproject.model.Employee;
import com.nikodev.myadminproject.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    /**
     * Getting all the employees from the database
     * @return {@literal List<Employee>} list of all employees
     */
    @GetMapping(name = "allEmployees", path = {"/employees", "/employee/all"})
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

}
