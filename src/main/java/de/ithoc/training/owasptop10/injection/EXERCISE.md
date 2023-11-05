# Exercise: Injection

## Goal

The application stores customer details in a database. The query can be manipulated by the user
in such that all customer details are returned.

Analyse the application and/or the code and find out how the query parameter needs to be fed to
get all customers.

## Preparation

1. Start the database by executing ```docker-compose up``` in this directory.
2. Connect to the database using ```localhost:5433``` (refer to ```application.properties```).
3. Create a database named ```java-injection-db```. Tables will be created automatically.
4. Start the application by executing ```mvn spring-boot:run``` in this directory.
5. Call URL from Postman (or the like).

## Tasks
Find the SQL injection vulnerability and exploit it.

## Note

## Ressource

```shell
curl --location 'http://localhost:8080/injection?customerId=<SQL INJECTION HERE>'
```
