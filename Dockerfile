FROM openjdk:17-jdk-alpine
WORKDIR /app
EXPOSE 8080
COPY target/*.jar /app/demooauth2.jar
ENTRYPOINT ["java", "-jar", "/app/demooauth2.jar"]