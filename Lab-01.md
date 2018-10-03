# Docker Workshop
Lab 01: Installing Docker in Ubuntu 18.04

---

## Instructions
In this lab we are going to install a fresh copy of Docker CE (Community Edition) on a Linux machine.
The steps are taken from the official Docker CE Installation page :
https://docs.docker.com/install/linux/docker-ce/ubuntu/
make sure to visit this page to verify the installation steps are still valid.

 - Remove Old versions ( Docker Engine /Docker.io)
 ```
$ sudo apt-get remove docker docker-engine docker.io
 ```
 
 - Update the apt package index
```
$ sudo apt-get update
```

- Set up a Repository from which the docker will be installed
```
$ sudo apt-get install \
    apt-transport-https \
    ca-certificates \
    curl \
    software-properties-common
```

```
$ curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -
```

- make sure the key is installed
```
$ sudo apt-key fingerprint 0EBFCD88
```

- Set up a repository

```
$ sudo add-apt-repository \
   "deb [arch=amd64] https://download.docker.com/linux/ubuntu \
   $(lsb_release -cs) \
   stable"
```   
 
 - Install the docker package
```
$ sudo apt-get update
```

```
$ sudo apt-get install docker-ce -y
```

 - Check that docker was successfully installed
```
$ sudo docker -v
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
