FROM --platform=linux/amd64 openjdk:17-alpine
EXPOSE 8080
ARG JAR_FILE=target/swiggy-gateway-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} swiggy-gateway.jar
ENTRYPOINT ["java","-jar","/swiggy-gateway.jar"]