# Microservice-Architecture

This project demonstrates a Microservices Architecture using Spring Boot, where a large application is broken down into smaller, independent services that work together.


# Project Architecture

1) User Service

-  Manages user - related data
-  Handles CRUD operations (Create, Read, Update, Delete)



2) Department Service

-  Manages department information
-  Provides department details when requested



3) Service Registry (Eureka Server)

-  Keeps track of all services
-  Helps services discover each other dyanmically



4) API Gateway

-  Single point for all client requests
-  Routes requests to appropriate microservices
-  Handles cross - cutting concerns like security, logging

************************************************************************************************************


# Microservices Project Structure

microservices-project/
│

├── service-registry/        (Eureka Server)

├── api-gateway/             (Gateway)

├── user-service/            (User Microservice)

├── department-service/      (Department Microservice)


├── README.md                (project explanation)

************************************************************************************************************

1) Service Registry (Eureka Server)

   service-registry/
│
├── src/main/java/com/app/
│   └── ServiceRegistryApplication.java
    └── ServletInitializer.java
│
├── src/main/resources/
│   └── application.properties
│
└── pom.xml
 
************************************************************************************************************

2) API Gateway

   api-gateway/
│
├── src/main/java/com/app/
│   └── ApiGatewayApplication.java
    └── ServletInitializer.java
│
├── src/main/resources/
│   └── application.yml
│
└── pom.xml



👉 Handles routing:

- /user/** → User Service

- /department/** → Department Service

************************************************************************************************************

3) User Service

   user-service/
│
├── src/main/java/com/app/
│   ├── controller/
│   │   └── UserController.java
│   │
│   ├── service/
│   │   ├── UserService.java
│   │   └── UserServiceImpl.java
│   │
│   ├── repository/
│   │   └── UserRepository.java
│   │
│   ├── entity/
│   │   └── User.java
│   │
│   ├── dto/
│   │   └── DepartmentDTO.java
│   │
│   
│   └── UserServiceApplication.java
    └── ServletInitializer.java
│
├── src/main/resources/
│   └── application.properties
│
└── pom.xml

************************************************************************************************************

4) Department Service

   department-service/
│
├── src/main/java/com/app/
│   ├── controller/
│   │   └── DepartmentController.java
│   │
│   ├── service/
│   │   ├── DepartmentService.java
│   │   └── DepartmentServiceImpl.java
│   │
│   ├── repository/
│   │   └── DepartmentRepository.java
│   │
│   ├── entity/
│   │   └── Department.java
│   │
│   └── DepartmentServiceApplication.java
│
├── src/main/resources/
│   └── application.properties
│
└── pom.xml

************************************************************************************************************

🔥 Important Concepts in Your Structure

1) Service Discovery

-  All services regiter with *Eureka*
-  Use :  eureka.client.service-url.defaultZone=http://localhost:8761/eureka

  

2) Communication between services

   In *User Service*

-  Call Department Service using :
         - RestTemplate



3) API Gateway Routing


   routes:
  - id: user-service
    uri: lb://USER-SERVICE
    predicates:
      - Path=/user/**

  - id: department-service
    uri: lb://DEPARTMENT-SERVICE
    predicates:
      - Path=/department/**
   
