# Spring Boot 3.0 Security with JWT Implementation
- This project demonstrates the implementation of security using Spring Boot 3.0 and JSON Web Tokens (JWT).

### Features
- User registration and login with JWT authentication
- Password encryption using BCrypt
- Customized access denied handling
- Logout mechanism (new ✨)
- Refresh token (new ✨)
- Implements roles and permission based authorization (new ✨)
- OpenApi 3 & Swagger UI integration (new ✨)
- JPA Auditing Implementation (new ✨)

### Technologies
- Spring Boot 3.0
- Spring Security
- Spring DataJPA
- JSON Web Tokens (JWT)
- PostgreSQL 16
- BCrypt
- Maven

### Getting Started
To get started with this project, you will need to have the following installed on your local machine:
- JDK 17+
- Maven 3+
  
To build and run the project, follow these steps:
1. Clone this repository
2. Add database "jwt_security" to postgres
3. Run the application with mvn spring-boot:run
4. Open http://localhost:8080/swagger-ui/index.html in your browser
5. Sign Up/Register a new user
6. Sign In/Login with the registered user
7. Copy the JWT token from the response
8. Click the Authorize button in the Swagger UI
9. Paste the JWT token in the Value field without the Bearer prefix
10. Click the Authorize button Now you can test the API endpoints

![image](https://github.com/haktanonur/spring-boot-3-security-6-jwt/assets/69698425/a945f339-1553-4231-8dfb-e4ddd4d7bf92)
