FROM amazoncorretto:11-alpine-jdk
MAINTAINER BFB
COPY target/portfolio-backend-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]