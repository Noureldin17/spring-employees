# Employees Management - Spring Boot
This repository is a simple API that has 4 endpoints that fetches some data from MySQL database:
- "api/employees": fetches all the employees available in the database.
- "api/employees/{employeeId}": fetches an employee with the given ID from the database.
- "api/v1/signin": Signs in to the application given the email and password.
- "api/v1/signup": Registers a new user given firstname, lastname, email, and password.

## JWT Authentication
This API uses JWT authentication to manage sessions and sign in and sign up operations. When the user signs in, it is a JWT token is returned which is used by the user in all other requests in the session. The passwords in the DB are also encrypted using a secret key.
