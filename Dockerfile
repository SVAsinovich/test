FROM openjdk:17-jdk-slim-buster
WORKDIR /app

COPY /target/test-0.0.1-SNAPSHOT.jar /app/test.jar

ENTRYPOINT ["java", "-jar", "test.jar"]