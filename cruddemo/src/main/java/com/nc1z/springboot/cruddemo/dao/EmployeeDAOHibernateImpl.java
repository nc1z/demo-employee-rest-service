package com.nc1z.springboot.cruddemo.dao;

import com.nc1z.springboot.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

    // field for entitymanager + inject dependency
    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional // TODO: Shift this to service layer later
    public List<Employee> findAll() {

        // get current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        // create query with native hibernate API
        Query<Employee> theQuery =
                currentSession.createQuery("from Employee", Employee.class);

        // execute query and get result list
        List<Employee> employees = theQuery.getResultList();

        // return results
        return employees;
    }
}
