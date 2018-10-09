# Docker Workshop
Challange 03 : Run Nginx container with mount to local folder 

---


## Instructions

 1. In this challange you are required to run an nginx web server.

 2. nginx usually runs on port 80 ,you need to allow access to it 
 from your local machine on port 8080 

 3. First, run the nginx image on you local machine (hint: use the -p option)

 4. Nginx welcome page is located at :
 /usr/share/nginx/html

5. you will need to mount the current folder with the index.html file (or any other file you choose to use) to the container location
/usr/share/nginx/html

6. hint : you can use $(pwd) to get the current directory where you run from.



## Solution

```
docker run -d --name "test-nginx" -p 8080:80 -v $(pwd):/usr/share/nginx/html nginx
```
