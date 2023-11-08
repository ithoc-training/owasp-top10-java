# Exercise: A01:2021 - Broken Access Control

## Disclaimer
The following code is intentionally insecure and should never be used in actual applications. It is for educational 
purposes only.

**Always ensure that your application is developed with security in mind, following best practices and guidelines like 
those recommended by OWASP.**

Proper access controls, input validation, and session management are crucial for the security of web applications.

## Goal
The code example contains vulnerabilities as a useful educational exercise to understand how security flaws can 
manifest in real-world applications.

Following GitHub repository is a simplified and intentionally vulnerable Java web application snippet along with 
some corresponding HTML/JavaScript code that exemplifies several of the vulnerabilities listed in the 
A01:2021 - Broken Access Control category of the OWASP Top 10.

https://github.com/ithoc-training/owasp-top10-java/tree/main

## Task
1. Analyse the code in package broken_access_control and understand what it semantically does.
2. Research and recap, what all the vulnerabilities are about.
3. Find and spot the following vulnerabilities in the code:
   - Broken Access Control
   - Parameter Tampering
   - Insecure Direct Object References (IDOR)
   - Missing Access Controls for POST, PUT, DELETE
   - Elevation of Privilege
   - Metadata Manipulation
   - CORS Misconfiguration
   - Force Browsing
