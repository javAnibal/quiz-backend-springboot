
FROM openjdk:24-jdk-slim
WORKDIR /app

COPY target/quiz-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

