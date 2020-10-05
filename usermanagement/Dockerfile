FROM openjdk:8-jdk-alpine
MAINTAINER armelknyobe@gmail.com
RUN addgroup -S kenany && adduser -S kenany -G kenany
USER kenany:kenany
EXPOSE 8081
ARG JAR_FILE=build/libs/*.war
COPY ${JAR_FILE} app.war
ENTRYPOINT ["java","-jar","/app.war"]