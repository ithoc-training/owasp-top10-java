# OWASP Top 10

## Goal
Identify the following vulnerabilities in the code enclosed in class ```BrokenAccessControl```
and describe how they can be exploited.
1. Broken Access Control
2. Cryptographic Failures
3. Injection
4. Insecure Design

## Task
Once you have analysed and understood each vulnerability, fix it.

## Note
User data is stored in text files in the ```data``` directory.

To run this app:

1. Run a setenv.sh script with database connection environment variables.
```shell
export DATASOURCE_URL=<database url>
export DATASOURCE_USERNAME=<database username>
export DATASOURCE_PASSWORD=<database password>
```
This requires a running PostgreSQL database with the schema ```cyber-security-db```.