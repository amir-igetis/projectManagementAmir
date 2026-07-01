# ==========================================
# STAGE 1: Build the application
# ==========================================
FROM maven:3.9-eclipse-temurin-21-alpine AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the pom.xml and source code to the container
COPY pom.xml .
COPY src ./src

# Package the application (skip tests to make it faster)
RUN mvn clean package -DskipTests

# ==========================================
# STAGE 2: Run the application
# ==========================================
FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

# Copy ONLY the built .jar file from the previous stage
COPY --from=build /app/target/*.jar app.jar

# Tell Docker which port your app uses (from your application.properties)
EXPOSE 5054

# The command to start the Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]