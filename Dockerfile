FROM eclipse-temurin:21-jre-alpine
WORKDIR /app1
COPY target/Hutly-0.0.1-SNAPSHOT.jar hutly.jar
EXPOSE 8080
CMD ["java", "-jar", "hutly.jar"]