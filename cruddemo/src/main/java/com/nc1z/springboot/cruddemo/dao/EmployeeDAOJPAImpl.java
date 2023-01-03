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

        // get employee
        Employee theEmployee = entityManager.find(Employee.class, theId);

        // return employee
        return theEmployee;
    }

    @Override
    public void save(Employee theEmployee) {

        // save or update the employee
        Employee dbEmployee = entityManager.merge(theEmployee);

        // update with id from db, return generated id
        theEmployee.setId(dbEmployee.getId());

    }

    @Override
    public void deleteById(int theId) {
        // delete object with primary key
        Query theQuery = entityManager.createQuery("delete from Employee where id=:employeeId");

        theQuery.setParameter("employeeId", theId);

        theQuery.executeUpdate();
    }
}
