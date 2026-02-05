# 基于 OpenJDK 8 的基础镜像，适用于 Spring Boot 2.x
FROM openjdk:8-jdk-slim

# 设置工作目录
WORKDIR /app

# 将 Maven 打包生成的 JAR 文件复制到容器中
# java-pack-test-1.0-SNAPSHOT.jar 是你项目打包后的名称，请根据实际情况修改
COPY target/java-pack-test-1.0-SNAPSHOT.jar app.jar

# 暴露 Spring Boot 应用默认的端口 8080
EXPOSE 8080

# 启动 Spring Boot 应用
ENTRYPOINT ["java","-jar","/app/app.jar"]