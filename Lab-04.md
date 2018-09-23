# Docker Workshop
Lab 04: Updating and Sharing Containers

---

## Preparations

 - Clean your docker host using the commands (in bash):

```
$ docker rm -f $(docker ps -a -q)
```
```
$ docker rmi -f $(docker images -a -q)
```



## Docker Commit

 - Run the application (version 3.0) in a Docker container (detached mode) in the port 5000 using:
```
$ docker run -d -p 5000:3000 --name static-app-3.0 selaworkshops/npm-static-app:3.0
```

 - Ensure the container is running:
```
$ docker ps
```

 - Create a new file into the container using the commands:
```
$ docker exec -it static-app-3.0 /bin/bash
$ echo "secret content" > secret-file
$ ls -l
$ cat secret-file
$ exit
```

 - Create a new image including the changes:
```
$ docker commit static-app-3.0 selaworkshops/npm-static-app:3.1
```

 - Delete the container static-app-3.0 using:
```
$ docker rm -f static-app-3.0
```

 - Inspect the images
```
$ docker images
```

 - Run a new container from the version 3 image (in port 5000):
```
$ docker run -d -p 5000:3000 --name static-app-3.0 selaworkshops/npm-static-app:3.0
```

 - Run a container from the created image (in port 5001):
```
$ docker run -d -p 5001:3000 --name static-app-3.1 selaworkshops/npm-static-app:3.1
```

 - Inspect the running containers with:
```
$ docker ps
```

 - Inspect the filesystem of the version 3.0 container:
```
$ docker exec static-app-3.0 ls -l
```

 - Inspect the filesystem of the commited container:
```
$ docker exec static-app-3.1 ls -l
```

 - As you see images doesn't change when a container changes but you can "commit" new images to save the container changes 

 
 
## Docker Save

 - Now let's save the commited container in a file (and store it in the current directory):
```
$ docker save -o static-app-3.1.tar selaworkshops/npm-static-app:3.1
```

 - Ensure the image was created in the current directory:
```
$ ls
```



## Docker Load

 - Clean your docker host environment:
```
$ docker rm -f $(docker ps -a -q)
$ docker rmi -f $(docker images -a -q)
```

 - Ensure that your docker host environment is clean:
```
$ docker ps
$ docker images
```

 - Let's load the docker image from the created file:
```
$ docker load -i static-app-3.1.tar
```

 - Ensure the image was loaded successfully:
 ```
 $ docker images
 ```