FROM openjdk:8-jdk-alpine
EXPOSE 8082
ADD target/timesheet-devops-1.0.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]