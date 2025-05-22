🔹 Coffee Product Update Program
Description:

This program reads all existing coffee records from the database and allows users to update the details of a specific coffee product by its ID using HTML and JSP.

Steps:

Create Coffee Table in MySQL
step 1:

First, create the coffee table in your MySQL database. Run the following SQL query:

CREATE DATABASE IF NOT EXISTS test;

USE test;

CREATE TABLE IF NOT EXISTS coffee (
    id INT AUTO_INCREMENT PRIMARY KEY,
    coffee_name VARCHAR(100),
    price DECIMAL(10, 2)
);

step 2:

HTML Form to Get Coffee ID and New Details

Create an HTML form (updateCoffee.html) where users can input the coffee_id, coffee_name, and price to update an existing coffee product.

step 3:

JSP Page to Process the Update (updateCoffee.jsp)

Create a JSP page (updateCoffee.jsp) to:

Retrieve the coffee ID and new details.

Update the corresponding coffee record in the database using the provided ID.

step 4:

Test and View Results

After deploying the application on a Tomcat server, open the form and enter a valid coffee_id along with the new coffee_name and price.

Upon submitting, the coffee record will be updated, and all coffee products will be displayed with the changes.

outputlink:
updatecoffee output=>(https://github.com/ITpavitra/ADJ_Pavitra-/blob/main/JDBC%20programs1/updatecoffe/p8_b.png)
