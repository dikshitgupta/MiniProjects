FROM adoptopenjdk/maven-openjdk11

MAINTAINER Dikshit Gupta

COPY pom.xml /build/
COPY src /build/src/

WORKDIR /build/

RUN mvn package

ENTRYPOINT ["java", "-jar", "target/springdocker.jar"]

