# demoOAuth2
OAuth2 Authentication Demonstration App

## Getting Started
To get started with this project, you will need to have the following installed on your local machine:

* JDK 17
* Maven 3

To build and run the project, follow these steps:

* Clone the repository: `git clone https://github.com/MikeReliable/demoOAuth2.git`  
* Generate Google OAuth 2.0 Client on https://console.cloud.google.com/apis/  
* Copy <client-id> and <client-secret> to 'application.properties' file
* Build the project: mvn clean install
* Run the project: mvn spring-boot:run

-> The application will be available at http://localhost:8080.

Login details:  
Username: 'admin' Password: 'password'  
Username: 'user' Password: 'password'
