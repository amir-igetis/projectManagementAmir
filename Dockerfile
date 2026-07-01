# ==========================================
# STAGE 1: Build the application
# ==========================================
FROM maven:3.9-eclipse-temurin-21-alpine AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src

# FIX: Added -e (errors) and -X (debug) for logging,
# and forced Maven to clean and compile before packaging
RUN mvn clean compile package -DskipTests

# ==========================================
# STAGE 2: Run the application
# ==========================================
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 5054
ENTRYPOINT ["java", "-jar", "app.jar"]