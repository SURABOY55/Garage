FROM maven:3.6.3-jdk-8

COPY target/*.jar /app.jar

cmd ["java","-jar","app.jar"]

# docker build -t garage:1.0 .   
# docker images
# docker run -p 8089:8080 garage:1.0