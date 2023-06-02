FROM --platform=linux/amd64 openjdk:17-alpine
EXPOSE 8081
ARG JAR_FILE=target/swiggy-app-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} swiggy-app.jar
ENTRYPOINT ["java","-jar","/swiggy-app.jar"]