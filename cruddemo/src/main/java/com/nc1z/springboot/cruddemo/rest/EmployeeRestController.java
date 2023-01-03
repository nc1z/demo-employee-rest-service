package com.nc1z.springboot.cruddemo.rest;

import com.nc1z.springboot.cruddemo.dao.EmployeeDAO;
import com.nc1z.springboot.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    //TODO: Shift this to service layer later
    @Autowired
    private EmployeeDAO employeeDAO;

    // expose /employees and return list of employees
    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

}
