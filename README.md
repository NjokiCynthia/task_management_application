Task Management Application

A Task Management Application built with SpringBoot<br/>
The Application is responsible for tracking date, task, priority  and status.<br/>

-- Packages<br/>
<h2>Entry Class</h3>
TaskApplication.java<br/>
This is the entry point for the Spring application

<h2>Main Class</h3>
Task.java<br/>
This is the main class in the application.<br/>
A class responsible for the getters and setters for the application.<br/>

<h2>controller</h3>
TaskController.java<br/>
A Spring Boot Controller responsible for: <br/>
CRUD Operations of a task, this is, <br />
1. Creating a task <br />
2. Reading a task <br />
3. Updating a task <br />
4. Deleting a task <br />

<h2>Exception</h3>
<b>CustomException.java</b> <br />
A Java class used to handle any exceptions that could occur during testing of the application
<br />

<br /> <br />
<h2>To run:</h2>
1. Start up SpringBoot Project
 https://spring.io/quickstart

2. Run the project

```
 .\gradlew.bat bootRun

