package com.suri.service;

import com.suri.entity.Employee;

import java.util.List;

public interface EmployeeService {
    String createEmployee(Employee employee);
    List<Employee> fetchAllEmployee();
}
