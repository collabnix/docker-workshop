# Docker Workshop
Lab 06: Building more complex images

---

## Instructions

 - Ensure you are in the previous created folder path:
```
$ pwd
```

 - Edit the dockerfile to expose the port 5000:
```
EXPOSE 5000
```
```
FROM selaworkshops/alpine:3.4
RUN apk-install python
CMD python -m SimpleHTTPServer 5000
EXPOSE 5000
```

 - Replace the CMD instruction for ENTRYPOINT to avoid override the command from the docker run command:
```
ENTRYPOINT python -m SimpleHTTPServer 5000
```
```
FROM selaworkshops/alpine:3.4
RUN apk-install python
ENTRYPOINT python -m SimpleHTTPServer 5000
EXPOSE 5000
```

 - Add a environment variable to set the application port:
```
ENV port=5000
```
```
FROM selaworkshops/alpine:3.4
RUN apk-install python
ENV port=5000
ENTRYPOINT python -m SimpleHTTPServer $port
EXPOSE $port
```

 - Create file "index.html" next to the Dockerfile with the content below:
```
<h1>Python App</h1>
```
```
$ ls -l
total 2
-rw-r--r-- 1 LeonJ 1049089 123 Jun 13 21:37 Dockerfile
-rw-r--r-- 1 LeonJ 1049089  19 Jun 13 21:54 index.html
```

 - Copy the file to the container using the ADD instruction:
```
ADD index.html /app/
```
```
FROM selaworkshops/alpine:3.4
RUN apk-install python
ENV port=5000
ADD index.html /app/
ENTRYPOINT python -m SimpleHTTPServer $port
EXPOSE $port
```

 - Set the app directory as the container working directory:
```
WORKDIR /app
```
```
FROM selaworkshops/alpine:3.4
RUN apk-install python
ENV port=5000
ADD index.html /app/
WORKDIR /app
ENTRYPOINT python -m SimpleHTTPServer $port
EXPOSE $port
```

 - Build the new image:
```
$ docker build -t python-app:2.0 .
```

 - Run the created image passing the port 5001 as parameter:
```
$ docker run -p 5001:5001 -e "port=5001" python-app:2.0
```

 - Browse to the application:
```
http://localhost:5001
```