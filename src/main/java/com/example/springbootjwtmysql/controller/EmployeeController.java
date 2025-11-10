package com.example.springbootjwtmysql.controller;

import com.example.springbootjwtmysql.model.Employee;
import com.example.springbootjwtmysql.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/name/{name}")
    public ResponseEntity<Employee> getEmployeeByName(@PathVariable String name) {
        Employee employee = employeeService.findEmployeeByName(name);
        if (employee != null) {
            return ResponseEntity.ok(employee);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}