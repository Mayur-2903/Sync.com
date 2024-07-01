# README.md file for java With Selenium Project #
This project is an automated testing suite using Java and Selenium WebDriver;It includes various test cases to ensure the functionality of a web application.

# Installation Prerequisites#
-Java Development Kit (JDK) 8 or higher
-Eclipse
-Apache Maven
-Selenium WebDriver
-TestNG framework

# Project Structure#
sync.com
├── src
│   └── test
│       ├── java
│       │   ├── pageObjects        # This folder contains the Page Object Model (POM) classes.
│       │   ├── testBase           # This folder contains base classes that provide common setup and teardown methods for the tests.
│       │   ├── testCases          # This folder contains the actual test case classes. Each class represents a set of related test cases.
│       │   └── utilities          # This folder contains utility classes that provide common functions and methods used across different test.
│       └── resources              # This directory contains test resources such as configuration files, test data files.
│            ├──  config.proprties # This folder contains common user data and application url.
│            ├──  log4j2.xml       # Supports different logging levels such as DEBUG, INFO, WARN, ERROR, and FATAL etc.
├── logs                           # This directory is used to store log files generated during the test execution.
├── reports                        # This directory is used to store test reports generated after the test execution.
├── screenshots                    # Screenshots are typically captured when a test fails to provide a visual reference for debugging purposes.
├── testData                       # This directory contains test data files used in the test cases.
├── pom.xml                        # The Project Object Model (POM) file for Maven. It contains the project's configuration details.
├── master.xml                     # This xml file used to run all testcase in single shot.
├──crossbrowsertest.xml            # This xml file used to Perform Crossbrowser testing.


# Running the Project in Using master.xml #
1) Open Eclipse IDE.
2) Navigate to the Project Explorer view.
3) Locate the master.xml file within your project.
4) Right-click on master.xml.
5) Select Run As > TestNG Suite.

# Running the Project in different browser Using crossbrowsertest.xml #
1) Open Eclipse IDE.
2) Navigate to the Project Explorer view.
3) Locate the crossbrowsertest.xml  file within your project.
4) Right-click on crossbrowsertest.xml.
5) Select Run As > TestNG Suite.

#  Tests #
1) TC_001_AccountRegistrationTest
2) TC_002_LoginTest

