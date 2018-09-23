# Docker Workshop
Demo 02: Understanding the Docker Components

---

## Instructions

 - Browse to the docker hub user main page and show the repositories:
```
https://hub.docker.com/r/selaworkshops/
```

 - Access to the grafana repository:
```
https://hub.docker.com/r/selaworkshops/grafana/
```

 - Show the repository image tags:
```
https://hub.docker.com/r/selaworkshops/grafana/tags/
```

 - Go to the terminal and check the existent images using:
```
$ docker images
```

 - Pull the version 3.0 with:
```
$ docker pull selaworkshops/grafana:5.1.3
```

 - Show the existent images and look for the pulled image:
```
$ docker images
```

 - Show the current running containers using:
```
$ docker ps
```

 - Create a new container from the pulled image:
```
$ docker run -d -p 3000:3000 selaworkshops/grafana:5.1.3
```

 - Check if the new container is running now:
```
$ docker ps
```

 - Browse to the application:
```
http://localhost:3000/
```