# microservices
Microservices (Spring boot + Docker / Docker Compose + Feign + Gradle)

Just a simple microservices project with two services which communicate through feign deployed in two docker containers

* BUILD USER MANAGEMENT

**cd usermanagement**
**./gradlew bootJar**

* BUILD GATEWAY

**cd gateway**
**./gradlew bootJar**

* DEPLOY ALL WITH DOCKER COMPOSE

**docker-compose up**

* CHECK TO THE BROWSER

**172.40.1.3:8080/school/api/auth/test**

**172.40.1.2:8081/user-management/api/test**

Now get the user informations either the usermanagement service or the gateway service

**172.40.1.2:8081/user-management/api/user/admin**

**172.40.1.3:8080/school/api/auth/account/admin**

