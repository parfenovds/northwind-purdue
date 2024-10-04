FROM openjdk:17-jdk
WORKDIR /app
COPY target/northwind*.jar /app/app.jar
EXPOSE 8189
ENTRYPOINT ["java", "-jar", "app.jar"]
