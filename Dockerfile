# -------- BUILD STAGE --------
FROM eclipse-temurin:17-jdk AS builder

WORKDIR /app

# Copy project
COPY . .

# Use Maven Wrapper (IMPORTANT)
RUN chmod +x mvnw && ./mvnw clean package -DskipTests

# -------- RUN STAGE --------
FROM eclipse-temurin:17-jre

WORKDIR /app

# Copy jar from build stage
COPY --from=builder /app/target/*.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
