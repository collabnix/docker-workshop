# Docker Workshop
Lab 05: Building your first image

---

## Preparations

 - Clean your docker host using the commands (in bash):

```
$ docker rm -f $(docker ps -a -q)
```
```
$ docker rmi -f $(docker images -a -q)
```



## Instructions

 - Create a new folder to store the Dockerfile:
```
$ mkdir first-dockerfile
$ cd first-dockerfile
```

 - Create a new file called "Dockerfile" with the following content:
```
FROM selaworkshops/alpine:3.4
RUN apk-install python
CMD python -m SimpleHTTPServer 5000
```

 - Build the image using:
```
$ docker build -t python-app:1.0 .
```

 - Ensure the image was created:
```
$ docker images
```

 - Run the created image in interactive mode to attach to the container process:
```
$ docker run python-app:1.0
```

 - Browse to the port 5000 to check if you can reach the application:
```
http://localhost:5000
```

 - The port 5000 is no exposed to the host so you can't reach the application. Let's see how to expose container ports in the next module.

 - Exit from the container using:
```
$ CTRL + C
```

 - Now, run the same image but passing a command as run parameter:
```
$ docker run python-app:1.0 "echo" "override command"
```

 - As you may have noticed the command inside the container was overridden by the command passed as parameter in the docker run command
 