package com.howtodoinjava.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.demo.model.Employee;

@RestController
public class Clima1 {

    @RequestMapping("/1")
    public List<Employee> getEmployees()
    {
        List<Employee> employeesList = new ArrayList<Employee>();
        employeesList.add(new Employee("fd:14:5c:38:e8:00","1515436500000","2018-01-08T18:35:00.000Z",58,"12",60,"15","80","66.9","30","34.45"));
        return employeesList;
    }


}
