# Docker Workshop
Challange 10 : Build a microservice architecture with Docker Compose!

---
## Task
In this Lab we are going to combine all what we have learned so far into a running 
microservice architecture running python as a backend, php as front-end and Redis as Cache latyer.

we are going to build the following system :

![alt text](https://raw.githubusercontent.com/tshaiman/docker-workshop/master/Challanges/challange10-composer/diagram.png)


## Instructions

 1. Choose your prefered technology (Node.js/Java/python)
 and write the simplest Hello World app.
 

 2. You can write it to a console or (preferebly) as Web Service on some port.

 3. Compose your Docker file , build it and run your container from the docker image you have created.

 4. Hint : use the most minimal base images recommended :

 ```
 FROM node:8
 FROM openjdk:8-jre-alpine
 ```
