📌 Coffee Insert Program
Description:
This program demonstrates inserting a new coffee product into a database. It uses a simple HTML form for user input and JSP to interact with the database.

Steps:
Create Coffee Table:
SQL to create the coffee table in MySQL:
CREATE DATABASE IF NOT EXISTS test;

USE test;

CREATE TABLE IF NOT EXISTS coffee (
    id INT AUTO_INCREMENT PRIMARY KEY,
    coffee_name VARCHAR(100),
    price DECIMAL(10, 2)
);
 Step 1:HTML Form for Coffee Insert

 step 2: JSP Page to Insert Coffee (addCoffee.jsp):
 Test and View Results:
After deploying the application on a Tomcat server:

Open the form and submit coffee details.

View the inserted product and all coffee products listed in the table.

Output:
The coffee insert output can be viewed in the following link:
🔗 Coffee Insert Output


