# Rsystem Automated Testing Project

## Project Overview

This project is an automated testing framework for the Rsystem application. It uses Selenium WebDriver, Java, TestNG, and Cucumber to test the functionality of the application, including login, document creation, and logout features.

## Technologies Used

Java

Selenium WebDriver

TestNG

Cucumber (BDD Framework)

Maven

# Directory Structure

~~~

mrrajak1296-rsystem/
├── README.md
├── Bug Report (1).xlsx
├── RTM.xlsx
├── TEST_PLAN (4).docx
├── Test Cases (4).xlsx
├── Test Scenario.xlsx
├── The Summary Report (4).docx
├── pom.xml
├── src/
│   └── test/
│       ├── java/
│       │   ├── pages/
│       │   │   ├── DocumentPage.java
│       │   │   └── LoginPage.java
│       │   ├── runners/
│       │   │   └── TestRunner.java
│       │   ├── stepDefinitions/
│       │   │   ├── DocumentSteps.java
│       │   │   └── LoginSteps.java
│       │   └── testCases/
│       │       ├── DocumentTest.java
│       │       └── LoginTest.java
│       └── resources/
│           └── Rsystem/
│               ├── document.feature
│               └── rsystem.feature
└── test-output/
    ├── emailable-report.html
    ├── index.html
    ├── testng-results.xml
    ├── junitreports/
    │   ├── TEST-runners.TestRunner.xml
    │   ├── TEST-testCases.DocumentTest.xml
    │   └── TEST-testCases.LoginTest.xml
~~~
# Setup and Installation

## Prerequisites

Java (JDK 11 or later)

Maven

ChromeDriver (for Selenium WebDriver)

## Project Explanation
Video Link : https://drive.google.com/file/d/1V_vwidAIKBwrAi2a2DAAAwrrHPQUKFZD/view?usp=drive_link

# Test Scenarios

## 1. Login Functionality

User can log in with valid credentials.

User cannot log in with invalid credentials.

## 2. Document Creation

User can create and save a new document.

User can edit and save changes to a document.

## 3. Logout Functionality

User can log out successfully from the application.

# Reporting

The test results are stored in the test-output/ directory.

JUnit reports are generated in test-output/junitreports/.

TestNG HTML reports are available in test-output/index.html.
