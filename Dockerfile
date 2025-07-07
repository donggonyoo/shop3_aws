# Dockerfile : shop3프로젝트 폴더에 생성

# 1단계 : 빌드 환경 (Gradle 사용)
FROM openjdk:17-jdk-slim as builder
WORKDIR /app
COPY . .
RUN chmod +x ./gradlew
RUN ./gradlew build -x test

# 2단계 : 실제 런타임 환경
FROM openjdk:17-jdk-slim
WORKDIR /app
# build/libs 폴더에서 SNAPSHOT 파일을 복사
COPY --from=builder /app/build/libs/shop3-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]