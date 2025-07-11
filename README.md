# 📝 ToDo App

A simple **ToDo List** web application built using **Spring Boot**, **Thymeleaf**, and **JPA/Hibernate**.  
Users can create, view, update, and delete tasks via a clean and responsive UI.

---

## 🔧 Tech Stack

- **Backend**: Spring Boot (Java), Spring MVC, Spring Data JPA
- **Frontend**: Thymeleaf, HTML/CSS
- **Database**: H2 (in-memory) or MySQL/PostgreSQL (configurable)
- **Build Tool**: Maven

---

## 🚀 Features

- ✅ Add new tasks
- 📝 Update task status (complete/incomplete)
- ❌ Delete tasks
- 📋 View all tasks
- ✅ Completed tasks appear with strikethrough (via CSS)
- 🌐 Web interface powered by Thymeleaf templating engine

---

## 🗂️ Project Structure
todoapp/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/todoapp/
│   │   │       ├── controller/         # Handles HTTP requests and routes
│   │   │       │   └── TaskController.java
│   │   │       ├── entity/             # Contains the Task entity/model class
│   │   │       │   └── Task.java
│   │   │       ├── repository/         # Spring Data JPA repository interface
│   │   │       │   └── TaskRepository.java
│   │   │       └── TodoAppApplication.java  # Main Spring Boot application class
│   │   └── resources/
│   │       ├── static/                 # Static assets (CSS, JS, images)
│   │       ├── templates/              # Thymeleaf templates (HTML pages)
│   │       │   └── index.html
│   │       └── application.properties  # Spring Boot configuration file
│   └── test/
│       └── java/                       # Unit and integration tests
│           └── com/example/todoapp/
│               └── TodoAppApplicationTests.java
├── pom.xml                             # Maven build configuration file
└── README.md                           # Project documentation

