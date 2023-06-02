FROM --platform=linux/amd64 openjdk:17-alpine
EXPOSE 8082
ARG JAR_FILE=target/restaurant-service-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} restaurant-service.jar
ENTRYPOINT ["java","-jar","/restaurant-service.jar"]