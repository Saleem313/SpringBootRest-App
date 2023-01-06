FROM java:8-jdk-alpine
RUN mkdir /usr/app
COPY ./target/spring-boot-docker-app.jar /usr/app/
WORKDIR /usr/app
ENTRYPOINT ["java","-jar", "SpringBootRest-App.jar"]
