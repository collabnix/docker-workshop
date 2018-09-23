# Docker Workshop
Lab 08: Using Volumes

---

## Preparations

 - Clean your docker host using the commands (in bash):

```
$ docker rm -f $(docker ps -a -q)
```
```
$ docker rmi -f $(docker images -a -q)
```
```
$ docker volume rm $(docker volume ls -q)
```


## Instructions

 - Display existent volumes:
```
$ docker volume ls
```

 - Create a new volume:
```
$ docker volume create my-volume
```

 - Inspect the new volume to find the mountpoint (volume location):
```
$ docker volume inspect my-volume
```
```
[
    {
        "CreatedAt": "2018-06-13T20:36:15Z",
        "Driver": "local",
        "Labels": {},
        "Mountpoint": "/var/lib/docker/volumes/my-volume/_data",
        "Name": "my-volume",
        "Options": {},
        "Scope": "local"
    }
]
```

 - Let's run a container and mount the created volume to the root:
```
$ docker run -it -v my-volume:/data --name my-container selaworkshops/busybox:latest
```

 - Create a new file under /data:
```
$ cd /data
$ touch new-file
$ ls
```

 - Open other terminal instance and run other container with the same volume:
```
$ docker run -it -v my-volume:/data --name my-container-2 selaworkshops/busybox:latest
```

 - Inspect the /data folder (the created file will be there):
```
$ cd data
$ ls
```

 - Exit from both containers and delete them:
```
$ exit
$ docker rm -f my-container my-container-2
```

 - Ensure the containers were deleted
```
$ docker ps -a
```

 - Run a new container attaching the created volume:
```
$ docker run -it -v my-volume:/data --name new-container selaworkshops/busybox:latest
```

 - Inspect the /data folder (the created file will be there):
```
$ cd data
$ ls
```

 - Exit from the container and delete it:
```
$ exit
$ docker rm -f new-container
```