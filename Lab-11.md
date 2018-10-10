# Docker Workshop
Lab 11: Simple Docker Compose

---

## Preparations

 - If you use Linux machine, install docker compose

 *Step 1*
```
$ sudo curl -L "https://github.com/docker/compose/releases/download/1.22.0/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose

```

*Step 2*
```
sudo chmod +x /usr/local/bin/docker-compose
```

 Test the installation
```
$ docker-compose --version
```


## Instructions

 - Create a new folder called "Docker-Compose"
```
$ mkdir Docker-Compose
```

 - Move to the new folder
```
$ cd Docker-Compose
```

- Create a docker-compose.yml file with the content below

```
version: '3'

services:
   artifactory:
     image: docker.bintray.io/jfrog/artifactory-pro:latest
     ports:
        - 8081:8081

   jenkins:
     image: jenkins/jenkins:lts
     ports:
       - 8080:8080
       - 50000:50000
```
 
 - Start all the containers with docker-compose up

```
 $ docker-compose up
```
 
 - Wait until docker complete to start the containers
  
 - Open another terminal window
  
 - Check if the containers are running

```
 $ docker ps
```
  - Navigate to http://localhost:8080/
  
  - You should see the Jenkins installation, is ask for "Administrator password"
  
  - Search the password on the first terminal window (where you run docker-compose up) and copy it
  
  - Paste the password on the Jenkins installation
  
  - Finish to install Jenkins
  
  - Navigate to http://localhost:8081/artifactory
  
  - Check that the website is up
  
  - Try to login with this credentials:

  **User name:** 
```
  admin
```
  **Password:**
```
  password
```
  
  - Stop the containers
```
  $ docker-compose stop
```

  - Ensure the cotnainers stopped
```
$ docker-compose ps
```
  
  
  
