FROM openjdk:8
RUN mkdir /usr/app
COPY ./target/spring-boot-docker-app.jar /usr/app/
WORKDIR /usr/app
ENTRYPOINT ["java","-jar", "SpringBootRest-App.jar"]
