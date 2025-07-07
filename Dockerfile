#1단계 빌드환경
From openjdk:17-jdk-slim as builder
workdir /app
copy . .
run chmod +x mvnw
run ./mvnw clean package -Dmaven.test.skip=true

#2단계(실제런타입환경)
from openjdk:17-jdk-slim
WORKDIR /app    
copy --from=builder /app/targer/shop3-0.0.1-SNASHOOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]