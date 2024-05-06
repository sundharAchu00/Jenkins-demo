FROM openjdk:17
WORKDIR /app
COPY ${JAR_FILE} app.jar
EXPOSE 1111
CMD ["java", "-jar", "devops-0.0.1-SNAPSHOT.jar"]
