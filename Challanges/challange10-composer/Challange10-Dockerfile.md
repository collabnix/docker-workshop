# Docker Workshop
Challange 10 : Build a microservice architecture with Docker Compose!

---
## Task
In this Lab we are going to combine all what we have learned so far into a running 
microservice architecture running python as a backend, php as front-end and Redis as Cache latyer.

we are going to build the following system :

![alt text](https://raw.githubusercontent.com/tshaiman/docker-workshop/master/Challanges/challange10-composer/link_extractor_diagram.png)


## Instructions 

### Building the Link Extractor Server (python)
 1. Go to Challange10/Step1 and examine the folder /api which is written in python
 2. look at linkextractor.py and main.py to get a general idea on how the app is running :
  - the main method uses the linkextractor.py module to scan Html pages and extract <a href> tags
  - the main file uses flask web framework that operates on port 5000 by default 
  - once the server is running any call to it using 'curl localhost:5000/api/<url> will extract links from that url

  3. build a container image for that python service , test it and run it.
