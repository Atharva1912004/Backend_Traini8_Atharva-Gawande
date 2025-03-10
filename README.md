# Backend_Traini8_Atharva-Gawande

## About

This project is a backend application developed using Spring Boot and Maven. It connects to a MySQL database to perform CRUD operations.

## Setup Instructions

1. **Clone the Repository**:

   Open your terminal and run:

   ```bash
   git clone https://github.com/Atharva1912004/Backend_Traini8_Atharva-Gawande.git
   ```
2. **Navigate to the Project Directory**:
   ```bash
   cd Backend_Traini8_Atharva-Gawande
   ```
3.**Configure Database Connection**:

Open src/main/resources/application.properties and update the following properties with your database details:
```bash
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```
4.Build and Run the Application:

Ensure Maven is installed. Then, execute:
```bash
mvn clean install
mvn spring-boot:run
```
5.Accessing the Application:

Once the application is running, you can access it at http://localhost:8080. Ensure that port 8080 is not blocked by any firewall or already in use by another application
To Post Training Center using Postman or another tool
```bash
http://localhost:8080/api/training-center
using POST method
```
To get all Training Center using Postman or another tool
```bash
http://localhost:8080/api
using GET method

```


