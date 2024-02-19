FROM openjdk:11
RUN mkdir /app
WORKDIR /app
COPY target/LearnDocker-0.0.1-SNAPSHOT.jar /app
EXPOSE 9494

ENTRYPOINT ["java", "-jar", "LearnDocker-0.0.1-SNAPSHOT.jar"]
