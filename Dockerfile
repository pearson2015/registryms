FROM openjdk:17
COPY ./target/registryms.jar /registryms.jar
CMD ["java", "-jar", "/registryms.jar"]
