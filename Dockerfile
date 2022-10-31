FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} 12-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/12-0.0.1-SNAPSHOT.jar"]