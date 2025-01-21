**Inventory Management System**

This project is an Inventory Management System built with Spring Boot and MySQL. It provides a REST API for managing items in an inventory. The API supports CRUD (Create, Read, Update, Delete) operations on inventory items.

Features
Create Item: Add a new item to the inventory.
Get All Items: Retrieve all items from the inventory.
Get Item by ID: Retrieve an item by its unique ID.
Update Item: Update an existing item's details.
Delete Item by ID: Delete an item from the inventory using its unique ID.
Delete All Items: Delete all items from the inventory.

Tech Stack
Backend: Spring Boot (Java)
Database: MySQL
Persistence: JPA/Hibernate
API Documentation: Postman (or any other tool for testing APIs)

Prerequisites
Make sure you have the following installed:
Java 8 or later
MySQL
Maven (for building the project)
Postman or any API testing tool (optional)

Setup
Clone the repository.

Configure MySQL Database:

Create a new database in MySQL (e.g., inventory_db).

Update the application.properties file with your MySQL database details:
spring.datasource.url=jdbc:mysql://localhost:3306/inventory_db
spring.datasource.username=root
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

Build and Run the Application.
The application should now be running at http://localhost:8080.

API Endpoints
Create Item (POST)

URL: /api/addItem

JSON Body
{
    "id": 1,
    "name": "Bottle",
    "description": "Water Bottle",
    "quantity": 10
}

Description: Adds a new item to the inventory.


Get All Items (GET)
URL: /api/getItems


Get Item by ID (GET)

URL: /api/getItemById/{id}
Example: /api/getItemById/1
Description: Fetch a specific item by ID.


Update Item (PUT)

URL: /api/updateItem/{id}
Example: /api/updateItem/1

Request Body:
{
    "name": "Updated Bottle",
    "description": "Updated Water Bottle",
    "quantity": 20
}
Response: 200 OK
Description: Updates the details of an existing item.


Delete Item by ID (DELETE)

URL: /api/deleteitem/{id}
Example: /api/deleteItems/1
Response: 200 OK (if item exists) or 404 Not Found (if item does not exist)
Description: Deletes a specific item by ID.


Delete All Items (DELETE)

URL: /api/deleteAll
Response: 200 OK
Description: Deletes all items in the inventory.

Testing with Postman
You can test the API using Postman or any other API testing tool. Here's an example of how to test the endpoints:

Create a new item:
Method: POST
URL: http://localhost:8080/api/addItems

Conclusion
This Inventory Management System API allows you to perform CRUD operations on items in your inventory using Spring Boot and MySQL. You can test and interact with the API using tools like Postman.
