package com.suri.controller;

import com.suri.entity.Employee;
import com.suri.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/create")
    public ResponseEntity<String> createEmp(@RequestBody Employee employee){
        //use service
        String result = employeeService.createEmployee(employee);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    @GetMapping("/findAll")
    public ResponseEntity<List<Employee>> fetechAllEmployee(){


            //use service

            List<Employee> list = employeeService.fetchAllEmployee();
            return new ResponseEntity<List<Employee>>(list,HttpStatus.OK);




    }
}
