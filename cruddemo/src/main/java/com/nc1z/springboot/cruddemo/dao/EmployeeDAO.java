package com.nc1z.springboot.cruddemo.dao;

import com.nc1z.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> findAll();
}
