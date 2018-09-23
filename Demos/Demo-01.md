# Docker Workshop
Demo 01: First contact with containers

---

## Preparations (before a demo)

 - Pull the jenkins image:

```
$ docker pull selaworkshops/jenkins-blueocean
```

## Instructions

 - Check the current running containers and images:
```
$ docker ps
```
```
$ docker images
```

 - Browse to the port 8080 to show to show that it's empty:
```
http://localhost:8080
```

 - Run a Jenkins container
```
$ docker run --name jenkins -p 8080:8080 selaworkshops/jenkins-blueocean
```

 - Browse to the Jenkins application
```
http://localhost:8080
```

 - Search for the administrator password in the log:
```
*************************************************************
*************************************************************
*************************************************************  
Jenkins initial setup is required. An admin user has been created and a password generated.
Please use the following password to proceed to installation:  
f7702d8c3e204cf7bfcce76dea9e1ec0  
This may also be found at: /var/jenkins_home/secrets/initialAdminPassword  
*************************************************************
*************************************************************
*************************************************************
```

 - Configure Jenkins using the administration password
 