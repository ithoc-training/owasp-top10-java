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
2. Parameter Tampering
3. Insecure Direct Object References (IDOR)
4. Missing Access Controls for POST, PUT, DELETE
5. Elevation of Privilege
6. Metadata Manipulation
7. CORS Misconfiguration
8. Force Browsing

## Ressource
```shell
curl --location 'http://localhost:8080/broken-access-control' \
--header 'Content-Type: application/json' \
--data-raw '{
    "userId": "userOne",
    "data": "user.two@example.com"
}'
```