# 1단계: 빌드 환경
FROM openjdk:17-jdk-slim AS builder
WORKDIR /app
COPY . .
RUN ls -l /app/gradlew
RUN chmod +x ./gradlew
RUN ./gradlew build -x test --stacktrace --info
RUN ls -l /app/build/libs/

# 2단계: 런타임 환경
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=builder /app/build/libs/shop3-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]