# Docker Workshop
Lab 01: Installing Docker in Ubuntu 18.04

---

## Instructions

 - Update the apt package index
```
$ sudo apt-get update
```

 - Install the docker package
```
$ sudo apt-get install docker.io -y
```

 - Check that docker was successfully installed
```
$ docker -v
```

 - Start the Docker daemon:
```
$ sudo systemctl start docker
```

 - Ensure that the Docker daemon will start after reboot:
```
$ sudo systemctl enable docker
```

 - Create the docker group (if it doesn't exist):
```
$ sudo groupadd docker
```

 - Add your user to the docker group (to be able to run docker without sudo):
```
$ sudo usermod -aG docker $USER
```

 - Restart the terminal using:
```
$ su - $USER
```

 - Verify that you can run the following commands without sudo:
```
$ docker run hello-world
$ docker ps
```