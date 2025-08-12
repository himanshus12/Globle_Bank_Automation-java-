# Globle_Bank_Automation-java-
A scalable Web UI Automation Framework built using Selenium WebDriver, Java, and TestNG. Designed with the Page Object Model (POM) architecture for maintainability, reusability, and ease of integration with CI/CD pipelines.

# API Automation Framework - Rest Assured + TestNG

## 📌 Overview
This is a Java-based API Automation Framework using **Rest Assured** and **TestNG**.  
It follows best practices for maintainability, scalability, and reusability.

## 🚀 Features
- Supports **GET, POST, PUT, DELETE** operations
- **Data-driven testing** with JSON/Excel
- **Configurable environments** (dev, qa, prod)
- **Allure & Extent HTML Reports**
- **Maven** build automation
- **Reusable utility classes** for request/response handling

## 📂 Project Structure
AutomationFramework/
│── .gitignore
│── README.md
│── pom.xml
│── testng.xml
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── api/
│   │   │   │   ├── endpoints/          # Classes for GET, POST, PUT, DELETE
│   │   │   │   ├── payload/            # POJO classes for request bodies
│   │   │   │   └── utilities/          # Reusable utils (JSON readers, token generators)
│   │   └── resources/
│   │       ├── config.properties       # Base URL, API Keys, etc.
│   │       └── testdata.json           # Test data file
│   │
│   ├── test/
│   │   ├── java/
│   │   │   ├── api/
│   │   │   │   └── tests/              # Test classes (TestNG annotations)
│   │   └── resources/
│   │       └── testng.xml              # Test suite XML
│
├── reports/
│   ├── allure-results/
│   ├── extent-reports/
│   └── logs/
│
└── docs/
    ├── API_Testing_Guide.md
    └── Framework_Design.png




Addtionls features

Sample Test Cases (e.g., Login, Search, Add to Cart for an e-commerce app.
Screenshots on Failure (stored in /reports/screenshots)
Custom Logger (Log4j2)
Maven profiles for running in different environments (-Pqa, -Pprod)
CI/CD Pipeline file (e.g., .github/workflows/ci.yml for GitHub Actions)
