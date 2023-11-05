# Exercise: Injection

## Goal

The application stores customer details in a database. The query can be manipulated by the user
in such that all customer details are returned.

Analyse the application and/or the code and find out how the query parameter needs to be fed to
get all customers.

## Preparation

1. Create an environment file named ```.env``` in this directory. Put following variable in it and use your values in the code.
    ```shell
    POSTGRES_USER=postgres
    POSTGRES_PASSWORD=postgres
    POSTGRES_DB=java-injection-db
    ```
2. Start the database by executing ```docker-compose up``` in this directory.
3. Connect to the database using ```localhost:5433``` (refer to ```application.properties```).
4. Create a database named ```java-injection-db```. Tables will be created automatically.
5. Start the application by executing ```mvn spring-boot:run``` in this directory.
6. Call URL from Postman (or the like).

## Tasks
Find the SQL injection vulnerability and exploit it.

## Note

## Ressource

```shell
curl --location 'http://localhost:8080/injection?customerId=<SQL INJECTION HERE>'
```
