FROM openjdk:21
COPY ./target/registryms-0.0.1-SNAPSHOT.jar /registryms.jar
CMD ["java", "-jar", "/registryms.jar"]