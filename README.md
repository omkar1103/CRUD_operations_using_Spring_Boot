Employee Management System
This is a simple Employee Management System that allows you to perform CRUD (Create, Read, Update, Delete) operations using a web interface. The application is built using HTML, CSS, JavaScript (jQuery), and Bootstrap for the frontend, and it interacts with a Java Spring Framework backend API for data management.
Usage
Open index.html in your web browser to access the Employee Management System frontend.

Use the form on the left to add or update employee details.

View the list of employees in the table on the right.

Use the action buttons in the table to view or delete employees.

API Endpoints
The application interacts with the following API endpoints provided by the Spring Boot backend:

GET /api/employee: Retrieves a list of all employees.
GET /api/employee/{id}: Retrieves details of a specific employee by ID.
POST /api/employee: Adds a new employee.
PUT /api/employee/{id}: Updates an existing employee by ID.
DELETE /api/employee/{id}: Deletes an employee by ID.
Features
Add Employee: Enter employee details (Name, Qualification, Salary) and click "ADD" to create a new employee record.
Update Employee: Enter the updated details of an employee and click "UPDATE" to modify the existing record.
View Employees: View the list of all employees in a table.
Delete Employee: Remove an employee record by clicking the delete button.
