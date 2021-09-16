FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} department-service.jar
ENTRYPOINT ["java","-jar","/hystrix-service.jar"]
EXPOSE 9295