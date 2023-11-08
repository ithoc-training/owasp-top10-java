# Exercise: A04:2021 - Insecure Design

**Exercise and Solution**

*Oliver Hock (oliver.hock@ithoc.de)*\
*Version 2023-11-08*

# Disclaimer
The following code is intentionally insecure and should never be used in actual applications. It is for 
educational purposes only.
Always ensure that your application is developed with security in mind, following best practices and 
guidelines like those recommended by OWASP.

Proper access controls, input validation, and session management are crucial for the security of web 
applications.

## Goal
Insecure design in the context of application development refers to a failure to incorporate adequate security 
measures at the architectural and design levels of software.
This category of risk manifests as flaws that are fundamentally different from implementation defects 
(like coding errors) because they stem from the absence or ineffectiveness of security measures at the design 
stage itself.
Following GitHub repository is a simplified and intentionally poorly designed Java web application snippet.

https://github.com/ithoc-training/owasp-top10-java

The distinction between insecure design and insecure implementation is crucial:

**Insecure Design**

This implies that the necessary security controls were not considered or integrated into the system from the beginning.
For example, if an application's architecture does not consider encryption for sensitive data transfers, no amount of 
secure coding practices can compensate for this oversight. The design itself lacks a critical control.

**Insecure Implementation**

On the other hand, it involves scenarios where the design is secure, but the way it's coded or configured leads to 
vulnerabilities.
An example could be a secure communication protocol that is implemented without proper certificate validation due to 
a coding error.

## Tasks
1. Analyse the code in package insecure_design and understand what it semantically does.
2. Research and recap, what all the vulnerabilities are about.
3. Find and spot the following vulnerabilities in the code:
   - Hardcoded Credentials
   - Lack of Encryption
   - Improper Authorization
   - No Audit Logging
   - No Account Lockout

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
