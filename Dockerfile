# Build stage
FROM maven:3.8.4-openjdk-8 AS build

WORKDIR /app
COPY pom.xml .
COPY src ./src

# Build the project
RUN mvn clean package

# Runtime stage
FROM openjdk:8-jre-slim

WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

# Run the application
CMD ["java", "-jar", "app.jar"]