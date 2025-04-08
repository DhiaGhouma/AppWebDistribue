# Use an official Java runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the local jar file into the container
COPY target/Rating-service-0.0.1-SNAPSHOT.jar /app/rating-service.jar

# Make port 8082 available to the world outside the container
EXPOSE 8082

# Run the application
ENTRYPOINT ["java", "-jar", "rating-service.jar"]
