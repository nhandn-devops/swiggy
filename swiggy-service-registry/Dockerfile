FROM --platform=linux/amd64 openjdk:17-alpine
EXPOSE 8761
ARG JAR_FILE=target/swiggy-service-registry-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} swiggy-service-registry.jar
ENTRYPOINT ["java","-jar","/swiggy-service-registry.jar"]