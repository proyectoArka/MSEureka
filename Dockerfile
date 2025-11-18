FROM eclipse-temurin:21-jre
LABEL version="1.0.0" maintainer="villa310esteban@gmail.com" description="Docker + Spring Boot en eureka"
WORKDIR /app
COPY *.jar app.jar
EXPOSE 8761
ENTRYPOINT ["java","-jar","app.jar"]