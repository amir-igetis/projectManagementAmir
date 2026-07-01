# ==========================================
# STAGE 1: Build the application
# ==========================================
FROM maven:3.9-eclipse-temurin-21-alpine AS build
WORKDIR /app
COPY pom.xml .
# Copy src code
COPY src ./src

# Explicitly run the build and show us if it's struggling to find lombok
RUN mvn clean package -DskipTests -X

# ==========================================
# STAGE 2: Run the application
# ==========================================
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 5054
ENTRYPOINT ["java", "-jar", "app.jar"]