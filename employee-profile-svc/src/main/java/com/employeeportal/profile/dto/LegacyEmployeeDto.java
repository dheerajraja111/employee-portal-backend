package com.employeeportal.profile.dto;

// Java record - getter, setter and toString automatically gets created
public record LegacyEmployeeDto (
    Long id,
    String name,
    String email,
    String phone,
    String website
){}
