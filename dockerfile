FROM openjdk:8-jdk-alpine
COPY target/msbuildtry-0.0.1-SNAPSHOT.war webapp.war
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","webapp.war"]
