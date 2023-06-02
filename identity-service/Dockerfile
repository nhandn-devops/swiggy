FROM --platform=linux/amd64 openjdk:17-alpine
EXPOSE 9898
ARG JAR_FILE=target/identity-service-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} identity-service.jar
ENTRYPOINT ["java","-jar","/identity-service.jar"]