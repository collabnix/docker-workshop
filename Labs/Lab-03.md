# Docker Workshop
Lab 03: Running commands inside the container

---


## Instructions

 - Run the application in a Docker container (detached mode) using:
```
$ docker run -d -p 3000:3000 --name static-app selaworkshops/npm-static-app:latest
```

 - Ensure the container is running:
```
$ docker ps
```

 - Attach to the container process using:
```
$ docker attach static-app
```

 - Exit from the process by enter (you will be attached to the npm start process):
```
$ (CTRL + C)
```

 - Check the running containers:
```
$ docker ps
```

 - If the container was stoped, delete it and run a new container using:
```
$ docker rm static-app
$ docker run -d -p 3000:3000 --name static-app selaworkshops/npm-static-app:latest
```

 - Execute the terminal (interactive) inside the container using:
```
$ docker exec -it static-app /bin/bash
```

 - Inspect the container filesystem:
```
$ ls -l
$ pwd
$ cd /
$ ls -l
```

 - Exit from the terminal using:
```
$ exit
```