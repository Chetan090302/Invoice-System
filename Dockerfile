# Use a base image containing Java runtime
FROM openjdk:17-jdk-alpine

# Set the working directory
WORKDIR /app

# Copy the built Spring Boot JAR file into the Docker image
COPY target/*.jar /app/my-spring-boot-app.jar

# Expose the port on which the application will run
EXPOSE 8080

# Define the command to run the application
CMD ["java", "-jar", "my-spring-boot-app.jar"]
