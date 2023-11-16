# Exercise: Broken Access Control

## Goal
Identify the following vulnerabilities in the code enclosed in class ```BrokenAccessControl``` 
and describe how they can be exploited.

## Task
Once you have analysed and understood the vulnerabilities, fix them.

## Note
User data is stored in text files in the ```data``` directory.

## Vulnerabilities

1. Broken Access Control
2. Cryptographic Failures
3. Injection
4. Insecure Design

## Ressource
```shell
curl --location 'http://localhost:8080/broken-access-control' \
--header 'Content-Type: application/json' \
--data-raw '{
    "userId": "userOne",
    "data": "user.two@example.com"
}'
```
