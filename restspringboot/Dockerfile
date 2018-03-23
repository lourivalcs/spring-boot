FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
ADD /build/libs/rest-spring-boot-0.0.1.jar rest-spring-boot-0.0.1.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/rest-spring-boot-0.0.1.jar"]