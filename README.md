# Inventory Management System

## Description
This project is an **Inventory Management System** built using **Spring Boot** and **MySQL**. The application provides a set of CRUD (Create, Read, Update, Delete) operations for managing items in an inventory. Each item consists of a name, description, and quantity. The system also supports basic error handling and provides clear responses for API interactions.

---

## API Endpoints

### 1. **Create Item**
- **URL**: `/api/addItems`
- **Method**: `POST`
- **Request Body**: 
  ```json
  {
      "name": "Bottle",
      "description": "Water Bottles",
      "quantity": 5
  }
Response:
Status: 201 Created
Body:  
{  
    "id": 1,  
    "name": "Bottle",  
    "description": "Water Bottles",  
    "quantity": 5  
}  


2. Get All Items
URL: /api/items
Method: GET
Response:
Status: 200 OK
Body:
json
Copy
Edit
[
    {
        "id": 1,
        "name": "Bottle",
        "description": "Water Bottles",
        "quantity": 5
    },
    {
        "id": 2,
        "name": "Cup",
        "description": "Tea Cups",
        "quantity": 10
    }
]
3. Get Item by ID
URL: /api/items/{id}
Method: GET
Response:
Status: 200 OK
Body:
json
Copy
Edit
{
    "id": 1,
    "name": "Bottle",
    "description": "Water Bottles",
    "quantity": 5
}
Error: If the item is not found, the response will be:
json
Copy
Edit
{
    "message": "Item with id 1 not found"
}
4. Update Item
URL: /api/items/{id}
Method: PUT
Request Body:
json
Copy
Edit
{
    "name": "Updated Bottle",
    "description": "Updated Water Bottles",
    "quantity": 10
}
Response:
Status: 200 OK
Body:
json
Copy
Edit
{
    "id": 1,
    "name": "Updated Bottle",
    "description": "Updated Water Bottles",
    "quantity": 10
}
5. Delete Item by ID
URL: /api/items/{id}
Method: DELETE
Response:
Status: 200 OK
Body:
json
Copy
Edit
{
    "message": "Item with id 1 deleted successfully"
}
Error: If the item is not found, the response will be:
json
Copy
Edit
{
    "message": "Item with id 1 not found"
}
Setup Instructions
Prerequisites
Before you begin, ensure you have the following installed on your local machine:

Java 11 or higher
Maven (for managing dependencies)
MySQL database server
1. Clone the Repository
First, clone the repository to your local machine:

bash
Copy
Edit
git clone https://github.com/your-username/inventory-management.git
2. Configure the Database
Create a new database in MySQL, for example inventory_db.
Update the application.properties file in the src/main/resources/ folder to match your MySQL setup:
properties
Copy
Edit
spring.datasource.url=jdbc:mysql://localhost:3306/inventory_db
spring.datasource.username=root
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update
3. Install Dependencies
Run the following Maven command to install all necessary dependencies:

bash
Copy
Edit
mvn install
4. Run the Application
After the dependencies are installed, run the application using:

bash
Copy
Edit
mvn spring-boot:run
This will start the application at http://localhost:8080.

Usage Examples
Example 1: Create a New Item
Request:

bash
Copy
Edit
POST http://localhost:8080/api/items
Content-Type: application/json
{
    "name": "Bottle",
    "description": "Water Bottles",
    "quantity": 5
}
Response:

json
Copy
Edit
{
    "id": 1,
    "name": "Bottle",
    "description": "Water Bottles",
    "quantity": 5
}
Example 2: Get All Items
Request:

bash
Copy
Edit
GET http://localhost:8080/api/items
Response:

json
Copy
Edit
[
    {
        "id": 1,
        "name": "Bottle",
        "description": "Water Bottles",
        "quantity": 5
    },
    {
        "id": 2,
        "name": "Cup",
        "description": "Tea Cups",
        "quantity": 10
    }
]
Example 3: Get Item by ID
Request:

bash
Copy
Edit
GET http://localhost:8080/api/items/1
Response:

json
Copy
Edit
{
    "id": 1,
    "name": "Bottle",
    "description": "Water Bottles",
    "quantity": 5
}
