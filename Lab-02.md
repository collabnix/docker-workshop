# Docker Workshop
Lab 02: Basic commands

---

## Preparations

 - Clean any running containers:
 
```
$ docker rm -f $(docker ps -a -q)
```

## Task
1. You have to run a web app called selaworkshops/npm-static-app, take its latest tag
and run it on the same port that the developer has created (3000)
2. clean your environment (the running containers) and re-run a diffrent version, this time 
map the application port (3000) to port 80 on your host.

## Instructions

 - Browse to the following site to see the application we will use during the labs:
```
https://hub.docker.com/r/selaworkshops/npm-static-app/
```

 - Run the application in a Docker container (detached mode) using:
```
$ docker run -d -p 3000:3000 --name static-app selaworkshops/npm-static-app:latest
```

 - Check that the container is running:
```
$ docker ps
```

 - Check which images exist in your host:
```
$ docker images
```

 - Remove the running container (with the force flag):
```
$ docker rm -f static-app
```


 - Check the running containers:
```
$ docker ps
```

- To run the same container on port 80 use :

```
$ docker run -d -p 80:3000 --name static-app selaworkshops/npm-static-app:latest
```
