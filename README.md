# employee-rest-service
Spring Boot + Hibernate + MySQL REST CRUD API

- Langauge: Java
- Framework: Spring Framework (& Spring Boot)
- Database: MySQL
- Dependencies: Spring Boot Starter Web (Includes Spring Web, Spring MVC, Hibernate, Jackson, Tomcat...)
- Package Manager: Maven

## User Stories

**REST clients must be able to**
- Get a list of employees
- Get a specific employee by id
- Add a new employee
- Update an employee
- Delete an employee

## Exception Handling (TODO - Optional)
- Use standard RunTimeException for now

Improvements:
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
<img width="525" alt="image" src="https://user-images.githubusercontent.com/111836326/210303239-5724fb7c-359f-4bc6-ab86-a326b3ba6c61.png">
