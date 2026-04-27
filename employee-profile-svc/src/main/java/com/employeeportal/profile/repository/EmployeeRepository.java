package com.employeeportal.profile.repository;

import com.employeeportal.profile.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Basic CRUD methods like save(), findById(), delete() automatically available!
}
