# Globle_Bank_Automation-java-
A scalable Web UI Automation Framework built using Selenium WebDriver, Java, and TestNG. Designed with the Page Object Model (POM) architecture for maintainability, reusability, and ease of integration with CI/CD pipelines.

# Selenium Web Application Automation Testing (Java + TestNG)

## 📌 Project Overview
This project demonstrates **end-to-end automation testing** of a web application using **Selenium WebDriver** with **Java**.  
It is built with **best practices** for maintainability, scalability, and reusability, following the **Page Object Model (POM)** design pattern.  
The project uses **TestNG** for test execution, reporting, and parameterization.

---

## 🛠 Tech Stack
- **Programming Language**: Java
- **Automation Tool**: Selenium WebDriver
- **Test Framework**: TestNG
- **Design Pattern**: Page Object Model (POM)
- **Build Tool**: Maven
- **Reporting**: Extent Reports / Allure Reports
- **IDE**: IntelliJ IDEA / Eclipse
- **Version Control**: Git & GitHub



## 📂 Project Structure
AutomationFramework
├── src/main/java
│ ├── base # Base classes (driver setup, configurations)
│ ├── pages # Page classes (POM)
│ ├── utils # Utility classes (helpers, wait, screenshot)
│
├── src/test/java
│ ├── tests # Test classes
│ ├── testdata # Test data files
│
├── testng.xml # TestNG configuration file
├── pom.xml # Maven dependencies
└── README.md # Project documentationd
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


---

## ⚡ Features
- **Cross-browser testing** (Chrome, Firefox, Edge)
- **Data-driven testing** using Excel/JSON
- **Reusable page actions** with POM
- **Custom wait utilities**
- **Automatic screenshot capture on failure**
- **Detailed HTML reporting**
- **Configurable test execution** via `testng.xml`

---

## 🚀 How to Run the Tests

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/your-username/selenium-java-webautomation.git




