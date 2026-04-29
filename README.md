# 🚀 Microservices Architecture Project

This project demonstrates a complete **Microservices Architecture** using Spring Boot, including Service Discovery, API Gateway, and inter-service communication.

---

## 📌 🏗️ Project Overview

The system is divided into multiple independent services:

* **User Service** → Manages user data
* **Department Service** → Manages department data
* **Service Registry** → Eureka Server for service discovery
* **API Gateway** → Central entry point for routing requests

---

## 🧩 🛠️ Tech Stack

* Java
* Spring Boot
* Spring Cloud (Eureka, Gateway)
* Spring Data JPA
* H2 / MySQL Database
* Maven
* Docker (optional)

---

## 📁 📂 Project Structure

```
microservices-project/
│
├── service-registry/
├── api-gateway/
├── user-service/
├── department-service/
│
└── README.md
```

---

## 🔍 ⚙️ Key Features

✔ Service Discovery using Eureka
✔ Centralized API Gateway Routing
✔ Inter-service Communication (User ↔ Department)
✔ Load Balancing using Eureka
✔ Independent Deployment of Services
✔ Scalable Architecture

---

## 🔄 🔗 Architecture Flow

1. Client sends request to **API Gateway**
2. API Gateway routes request to respective microservice
3. Services communicate via REST (or Feign Client)
4. All services register with **Eureka Server**

---

## ▶️ 🚀 How to Run the Project

### Step 1: Start Service Registry

Run the Eureka Server:

```
http://localhost:8761
```

---

### Step 2: Start Microservices

Run in order:

1. API Gateway
2. Department Service
3. User Service

---

### Step 3: Access APIs via Gateway

| Service            | Endpoint                            |
| ------------------ | ----------------------------------- |
| User Service       | http://localhost:9191/user/**       |
| Department Service | http://localhost:9191/department/** |

---

## 🧪 📬 API Testing (Postman)

Use **Postman** to test APIs:

### Example: Create User

```
POST /user
Content-Type: application/json

{
  "name": "Nikita",
  "email": "nikita@gmail.com",
  "departmentId": 1
}
```

---



## 💡 📘 Learning Outcomes

* Understanding Microservices Architecture
* Service Discovery with Eureka
* API Gateway implementation
* Inter-service communication
* Load balancing concepts

---

⭐ 📌 Note

This project is created for learning and demonstrating microservices architecture using Spring Boot.
