package com.suri.service;

import com.suri.entity.Employee;
import com.suri.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public String createEmployee(Employee employee) {
        Employee employee1 = employeeRepository.save(employee);
        System.out.println("After Saving :: " +employee1);
        return "employee created with Id :: "+employee1.getId();
    }

    @Override
    public List<Employee> fetchAllEmployee() {
       List<Employee> list = employeeRepository.findAll();
        return list;
    }
}
