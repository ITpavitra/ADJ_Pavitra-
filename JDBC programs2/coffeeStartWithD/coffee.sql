CREATE DATABASE IF NOT EXISTS test;

USE test;

CREATE TABLE IF NOT EXISTS coffee (
    id INT PRIMARY KEY,
    coffee_name VARCHAR(100),
    price DECIMAL(10,2)
);

-- Insert some test data
INSERT INTO coffee VALUES (1, 'Latte', 120.00);
INSERT INTO coffee VALUES (2, 'Espresso', 80.00);
INSERT INTO coffee VALUES (3, 'Cappuccino', 100.00);

