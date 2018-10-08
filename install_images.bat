echo "pulling docker images for the Sela Docker workshop"
docker pull hello-world
docker pull nginx
docker pull selaworkshops/npm-static-app:latest
docker pull selaworkshops/npm-static-app:3.0
docker pull selaworkshops/npm-static-app:3.1
docker pull selaworkshops/alpine:3.4
docker pull selaworkshops/python-app:1.0
docker pull selaworkshops/python-app:2.0
docker pull selaworkshops/busybox:latest
docker pull alpine:latest
docker pull selaworkshops/ngnix:alpine
docker pull redis:3.2-alpine
docker pull python:3.6.3
docker pull openjdk:8-jre-alpine
docker pull node:8
docker pull selaworkshops/jenkins-blueocean
docker pull selaworkshops/grafana:5.1.3

echo "Done"