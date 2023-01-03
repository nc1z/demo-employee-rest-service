package com.nc1z.springboot.cruddemo.dao;

import com.nc1z.springboot.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJPAImpl implements EmployeeDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> findAll() {

        // Create query
        Query theQuery = entityManager.createQuery("from Employee");

        // execute query and get result list
        List<Employee> employees = theQuery.getResultList();

        return employees;
    }

    @Override
    public Employee findById(int theId) {
        return null;
    }

    @Override
    public void save(Employee theEmployee) {

    }

    @Override
    public void deleteById(int theId) {

    }
}
