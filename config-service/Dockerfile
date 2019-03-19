FROM openjdk:11

ADD ./target/config-service-0.0.1-SNAPSHOT.jar /usr/src/config-service-0.0.1-SNAPSHOT.jar

WORKDIR usr/src

EXPOSE 8888

ENTRYPOINT ["java","-jar", "config-service-0.0.1-SNAPSHOT.jar"]