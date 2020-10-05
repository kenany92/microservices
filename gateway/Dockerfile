FROM openjdk:8-jdk-alpine
MAINTAINER armelknyobe@gmail.com
RUN addgroup -S kenany && adduser -S kenany -G kenany
USER kenany:kenany
EXPOSE 8080
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=docker", "app.jar"]