Employee Management JDBC program

This project allows users to insert employee records into a MySQL database using JSP and JDBC, and view all employee records in a report format.

🔧 Requirements
Java (JDK)
Apache Tomcat Server
MySQL Database
MySQL JDBC Driver
📦 Setup Steps
Create Database and Table in MySQL
CREATE DATABASE Employee;
USE Employee;
CREATE TABLE Emp (
    Emp_NO INT PRIMARY KEY,
    Emp_Name VARCHAR(50),
    BasicSalary DOUBLE
);
Clone or Copy the Project

Place MySQL JDBC Driver

Download mysql-connector-java.jar

Add it to your project’s lib folder or build path

Update DB Credentials

In DBConnection.java, update:

DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "your_password");

Deploy to Tomcat

Copy the project folder to Tomcat/webapps/

Start the Tomcat server

Run the App:

http://localhost:8080/your_project_name/

OUTPUTLINKS:-

8d =>[update Employee Table](https://github.com/ITpavitra/ADJ_Pavitra-/blob/main/JDBC%20programs1/updateEmployee/Screenshot%202025-05-22%20213843.png)

8d=>[update employee details]https://github.com/ITpavitra/ADJ_Pavitra-/blob/main/JDBC%20programs1/updateEmployee/Screenshot%202025-05-22%20213834.png)
