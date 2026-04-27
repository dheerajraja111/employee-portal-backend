package com.employeeportal.profile.service;

import com.employeeportal.profile.dto.LegacyEmployeeDto;
import com.employeeportal.profile.entity.Employee;
import com.employeeportal.profile.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    private final RestClient restClient;

    public EmployeeService () {
        this.restClient = RestClient.builder().baseUrl("https://jsonplaceholder.typicode.com").build();
    }

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    public LegacyEmployeeDto getLegacyEmployeeDetails(Long legacyId) {
        return restClient.get()
                .uri("/users/{id}", legacyId)
                .retrieve()
                .body(LegacyEmployeeDto.class);
    }

}
