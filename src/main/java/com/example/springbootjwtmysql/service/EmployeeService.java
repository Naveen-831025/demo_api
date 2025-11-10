package com.example.springbootjwtmysql.service;

import com.example.springbootjwtmysql.model.Employee;
import com.example.springbootjwtmysql.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee findEmployeeByName(String name) {
        return employeeRepository.findByName(name);
    }
}