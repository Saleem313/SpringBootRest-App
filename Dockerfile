FROM openjdk:8
RUN mkdir /usr/app
COPY ./target/SpringBootRest-App.jar /usr/app/
WORKDIR /usr/app
ENTRYPOINT ["java","-jar", "SpringBootRest-App.jar"]
