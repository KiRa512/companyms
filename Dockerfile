# Start from an official Java runtime
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from your local target folder into the container
COPY target/companyms-*.jar app.jar

# Expose the port your service runs on
EXPOSE 8081

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
