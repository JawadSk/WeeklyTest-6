# WeeklyTest-6

## FrameWork Used
* Spring Boot

## Language Used
* Java

## Data Model

* The Job data model is defined in the Job class, which has the following attributes:
### User Model

*userId:integer
userName:string
userEmail:string
userPassword:string
userPhoneNumber:string

### Product Model

* productId:integer 
productName:string
productPrice:integer
productDescription:string
productCategory:string
productBrand:string
### Address Model

* addressId:integer    
addressName:string
landmark:string
phoneNumber:string
zipcode:string
state:string
userId : foreign key mapping

### Order Model

* orderId:integer
userId:integer (foreign key mapping)
productId:integer(foreign key mapping)
addressId:integer(foreign key mapping)
productQuantity:integer

## DataFlow

* 1) The user at client side sends a request to the application through the API endpoints.
* 2) The API receives the request and sends it to the appropriate controller method.
* 3) The controller method makes a call to the method in service class.
* 4) The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
* 5) The controller method returns a response to the API.
* 6) The API sends the response back to the user.
*
## API End Points
* The following endpoints are available in the API:

* /users (POST): Create a new user
/users (GET): Get user by user ID (request param)
/products (POST): Add a new product
/products (GET): Get all products (request param is null)
/products/{id} (DELETE): Delete a product by product ID (path variable)
/products (GET): Get products based on category (request param)
/address (POST): Create a new address
/orders (POST): Place a new order
/orders : Get an order by order ID (request param)
/orders/{id} (DELETE) : Delete a order by order ID (path variable)

## DataBase Used

### > SQL database
* I have used Persistent database to implement CRUD Operations.

## Project Summary

* This API provides basic functionality for an Ecommerce platform, allowing users to create accounts, add products,
create orders and manage addresses. The project can be extended to include additional features as required.
