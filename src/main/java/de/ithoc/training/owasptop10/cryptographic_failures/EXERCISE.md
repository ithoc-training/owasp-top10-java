# Exercise: Cryptographic Failures

## Goal
Assume you have got user password pairs from a system by calling ```http://localhost:8080/cryptographic-failures```.
Passwords are stored other than clear text. 

Analyse which methodology was used to save password and convert them to clear text. 

## Task
You might want to take a look into the source code of the class ```CryptographicFailures```.

## Note
Passwords are stored in a text file ```passwords.txt``` in ```data``` directory.

## Ressource
```shell
curl --location 'http://localhost:8080/cryptographic-failures'
```