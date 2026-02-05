# 将原来的 FROM openjdk:8-jdk-slim 改为：
FROM eclipse-temurin:8-jdk-focal

# 设置工作目录
WORKDIR /app

# 将 Maven 打包生成的 JAR 文件复制到容器中
COPY target/java-pack-test-1.0-SNAPSHOT.jar app.jar

# 暴露端口
EXPOSE 8080

# 启动命令
ENTRYPOINT ["java","-jar","/app/app.jar"]