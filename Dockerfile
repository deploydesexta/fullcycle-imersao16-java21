FROM eclipse-temurin:21.0.1_12-jre-alpine

COPY build/libs/*-SNAPSHOT.jar /opt/app.jar

CMD java -jar /opt/app.jar