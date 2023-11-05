# Exercise: Insecure Design

## Goal
Identify the following vulnerabilities in the code enclosed in package ```insecure_design```
and describe how they can be exploited.

## Vulnerabilities
1. Hardcoded Credentials
2. Lack of Encryption
3. Improper Authorization
4. No Audit Logging
5. No Account Lockout

## Tasks
Find the vulnerabilities and exploit them.

## Note

## Ressource
```shell
curl --location 'http://localhost:8080/insecure-design' \
--header 'Content-Type: application/json' \
--data '{
    "user" : {
        "username": "userA",
        "password": "passwordA",
        "loggedIn": true
    },
    "fromIban": "1234567890A",
    "toIban": "1234567890B",
    "amount": 125.00
}'
```
