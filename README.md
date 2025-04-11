### 1. **Project Title**
- **Spring Boot JDBC Demo**

### 2. **Project Description**
- This project is a simple Spring Boot application demonstrating how to use JDBC for performing CRUD operations on a relational database. It's designed to be a lightweight, modular, and automation-friendly backend application that can serve as a foundation for integrating automated tests for database-driven applications.

### 3. **Technologies & Tools Used**
- **Programming Language**: Java  
- **Framework**: Spring Boot  
- **Database**: H2 (In-Memory Database)  
- **Data Access**: Spring JDBC (`JdbcTemplate`)  
- **Build Tool**: Maven  
- **Version Control**: Git & GitHub  
- **Testing Framework (Suggested for Extension)**: JUnit / TestNG (not currently included, but framework ready)

### 4. **Project Structure**
```
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── demo
│   │   │               ├── controller   # REST controller handling HTTP requests
│   │   │               ├── dao          # Data access layer using JdbcTemplate
│   │   │               ├── model        # Domain models / DTOs
│   │   │               └── service      # Business logic layer
│   └── resources
│       ├── application.properties       # Configuration file
│       └── schema.sql                   # DB schema for initialization
├── pom.xml                              # Maven build configuration
├── README.md                            # Documentation
```

### 5. **Installation & Setup**
- **Prerequisites:**
  - Java 11 or later  
  - Maven installed  

- **Steps to Set Up the Project:**
  1. Clone the repository:
     ```sh
     git clone https://github.com/MarwanSultan/springboot_jdbc_demo.git
     ```
  2. Navigate to the project directory:
     ```sh
     cd springboot_jdbc_demo
     ```
  3. Install dependencies:
     ```sh
     mvn clean install
     ```
  4. Run the application:
     ```sh
     mvn spring-boot:run
     ```

### 6. **How to Use**
- Once the app is running, access the REST endpoints via Postman or a browser.  
- The H2 database console can be accessed (if enabled) at:  
  ```
  http://localhost:8080/h2-console
  ```  
- Use the credentials defined in `application.properties` to log into the H2 console.  
- The `schema.sql` script initializes the required database tables at runtime.  
- You can easily integrate a test automation suite to verify API responses and DB interactions.

### 7. **Contributing**
- Fork the repository  
- Create a feature branch (`feature-branch-name`)  
- Commit your changes and push them  
- Create a Pull Request  

### 8. **License**
- This project is licensed under the **MIT License**

### 9. **Author**
- **Marwan Sultan**  
- LinkedIn: [linkedin.com/in/marwansultan](https://www.linkedin.com/in/marwansultan/)  
- Email: marwan.sultan@gmail.com
