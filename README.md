# Spring Boot JWT MySQL Authentication

This project is a Spring Boot application that demonstrates how to implement JWT Bearer Token authentication with a MySQL database. It includes a simple employee management system where you can retrieve employee details by name.

## Features

- JWT authentication for secure API access
- MySQL database connection
- Employee management with CRUD operations
- Spring Security for securing endpoints

## Project Structure

```
spring-boot-jwt-mysql
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── springbootjwtmysql
│   │   │               ├── SpringBootJwtMysqlApplication.java
│   │   │               ├── config
│   │   │               │   └── SecurityConfig.java
│   │   │               ├── controller
│   │   │               │   └── EmployeeController.java
│   │   │               ├── service
│   │   │               │   └── EmployeeService.java
│   │   │               ├── repository
│   │   │               │   └── EmployeeRepository.java
│   │   │               └── model
│   │   │                   └── Employee.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── schema.sql
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── springbootjwtmysql
│                       └── SpringBootJwtMysqlApplicationTests.java
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## Setup Instructions

1. **Clone the repository:**
   ```
   git clone <repository-url>
   cd spring-boot-jwt-mysql
   ```

2. **Configure MySQL Database:**
   - Create a new MySQL database.
   - Update the `src/main/resources/application.properties` file with your database connection details.

3. **Run the application:**
   ```
   ./mvnw spring-boot:run
   ```

4. **Access the API:**
   - Use tools like Postman or curl to interact with the API.
   - Authenticate using the login endpoint to receive a JWT token.
   - Use the token to access protected endpoints.

## Usage

- **Get Employee by Name:**
  - Endpoint: `GET /api/employees/{name}`
  - Description: Retrieves an employee's details by their name.

## Dependencies

- Spring Boot
- Spring Security
- Spring Data JPA
- MySQL Driver
- JWT Library

## License

This project is licensed under the MIT License.