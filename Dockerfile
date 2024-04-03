FROM openjdk:11
EXPOSE 8080
ADD target/testspringboot.jar testspringboot.jar
ENTRYPOINT [ "java","-jar","testspringboot.jar"]