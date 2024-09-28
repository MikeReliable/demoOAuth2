# demoOAuth2

OAuth2 Authentication Demonstration App

## Getting Started

To get started with this project, you will need to have the following installed on your local machine:

* JDK 17
* Maven 3
* Docker

To build and run the project, follow these steps:

* Clone the repository: 
```sh
git clone https://github.com/MikeReliable/demoOAuth2.git
 ```
* Generate Google OAuth 2.0 Client on https://console.cloud.google.com/apis/
* Copy <client-id> and <client-secret> to 'application.properties' file
* Build the project:

```sh
mvn clean install
 ```

* Run project on local machine (a) or with Docker (b)  

a) local machine

```sh
mvn spring-boot:run
 ```

b) Docker:

```sh
docker build -t demooauth2 .
 ```
```sh
docker run --name demooauth2 -p 8080:8080 demooauth2
 ```

-> The application will be available at http://localhost:8080.

Login details:  
with ROLE_ADMIN - Username: 'admin' Password: 'password'  
with ROLE_USER - Username: 'user' Password: 'password'
