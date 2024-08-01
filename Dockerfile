FROM openjdk:18
WORKDIR /app
COPY ./target/StudentsbRestAppln-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
CMD ["java", "-jar", "StudentsbRestAppln-0.0.1-SNAPSHOT.jar"]
