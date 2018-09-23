FROM openjdk:8-jre-alpine
COPY target/secrets.jar secrets.jar
COPY config.json config.json
ENV USERNAME "user1"
ENV PASSWORD "pass1"
ENTRYPOINT ["java" , "-jar" , "secrets.jar"]