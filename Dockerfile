FROM adoptopenjdk/openjdk11:alpine-jre

LABEL authors="Orkhan Huseynli"

ARG JAR_FILE=target/sample-core-1.0-SNAPSHOT.jar

# cp sample-core-1.0-SNAPSHOT.jar /opt/app/app.jar
WORKDIR /opt/app

COPY ${JAR_FILE} ./app.jar

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","app.jar"]