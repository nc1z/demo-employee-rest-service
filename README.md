# employee-rest-service
Spring Boot + Hibernate + MySQL REST CRUD API

Langauge: Java
Framework: Spring Framework (& Spring Boot)
Database: MySQL
Dependencies: Spring Boot Starter Web (Includes Spring Web, Spring MVC, Hibernate, Jackson, Tomcat...)
Package Manager: Maven

## User Stories

**REST clients must be able to**
- Get a list of employees
- Get a specific employee by id
- Add a new employee
- Update an employee
- Delete an employee

## Exception Handling
- Custom error response class
- Custom exception class
- Throw custom exception if employee not found via REST service
- Include global exception handling
  - Catch all (BAD_REQUEST)
  - Employee not found (NOT_FOUND)

## Endpoints
- **GET** ~/api/employees
- **GET** ~/api/employees/:employeeId
- **POST** ~/api/employees
- **PUT** ~/api/employees
- **DELETE** ~/api/employees/:employeeId

## Application Architecture
<img width="521" alt="image" src="https://user-images.githubusercontent.com/111836326/210233511-e3024a97-8120-4838-b372-7863ee64d011.png">
