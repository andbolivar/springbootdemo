package com.howtodoinjava.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.demo.model.Employee;

@RestController
public class Clima2 {

    @RequestMapping("/2")
    public List<Employee> getEmployees()
    {
        List<Employee> employeesList = new ArrayList<Employee>();
        employeesList.add(new Employee("fd:14:5c:38:e8:00","1515436500000","2018-01-08T18:35:00.000Z",58,"0.9",4,"5","61","86","0","34.45"));
        return employeesList;
    }


}
