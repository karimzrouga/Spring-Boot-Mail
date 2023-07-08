FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar javamail.jar
ENTRYPOINT ["java","-jar","/javamail.jar"]
EXPOSE 8080