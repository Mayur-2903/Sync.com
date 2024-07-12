# README.md file for java With Selenium Project #
This project is an automated testing suite using Java and Selenium WebDriver;It includes various test cases to ensure the functionality of a web application.

# Installation Prerequisites#
-Java Development Kit (JDK) 8 or higher `(https://download.oracle.com/java/22/latest/jdk-22_windows-x64_bin.exe (sha256))`
-Eclipse `(https://www.eclipse.org/downloads/)`
-Apache Maven `(https://maven.apache.org/download.cgi)`
-Github `(https://git-scm.com/downloads)`

# Project import into Eclipse #
-Open Eclipse IDE.
-Select File -> Import -> Existing Projects into Workspace.
-Browse to the directory where you cloned the repository and select the project.
-Click Finish.

# Project Structure#
sync.com
├── src
│   └── test
│       ├── java
│       │   ├── pageobjects        # This folder contains the Page Object Model (POM) classes.
│       │   ├── testbase           # This folder contains base classes that provide common setup and teardown methods for the tests.
│       │   ├── testcases          # This folder contains the actual test case classes. Each class represents a set of related test cases.
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
1) Open Eclipse.
2) Navigate to the Project Explorer view.
3) Locate the master.xml file within your project.
4) Right-click on master.xml.
5) Select Run As > TestNG Suite.

# Running the Project in different browser Using crossbrowsertest.xml #
1) Open Eclipse.
2) Navigate to the Project Explorer view.
3) Locate the crossbrowsertest.xml  file within your project.
4) Right-click on crossbrowsertest.xml.
5) Select Run As > TestNG Suite.

# Running the Project in Using Command Prompt #
1) Download Apache Maven `https://maven.apache.org/download.cgi`
2) Configure the maven path in environment variable
3) Open Command Prompt
4) Go to Project location `C:\Users\mkokare\git\repository4\Sync.com>`
5) Run Command `mvn test`

# As of now, I have created 6 test cases, which are as follows #
1) TC001 Account registration test case.
2) TC002 Login test case.
3) TC003 and TC004 Login data-driven test case: Includes valid and invalid credentials taken from an Excel sheet.
4) TC005 Create file test case.
5) TC006 Delete file test case

