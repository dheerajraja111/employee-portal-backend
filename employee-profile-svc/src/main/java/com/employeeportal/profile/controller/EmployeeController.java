package com.employeeportal.profile.controller;

import com.employeeportal.profile.dto.LegacyEmployeeDto;
import com.employeeportal.profile.entity.Employee;
import com.employeeportal.profile.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping
    public List<Employee> getEmployees() {
        return service.getAllEmployees();
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return service.saveEmployee(employee);
    }

    @GetMapping("/legacy/{id}")
    public LegacyEmployeeDto fetchLegacyData(@PathVariable Long id) {
        return service.getLegacyEmployeeDetails(id);
    }
}
