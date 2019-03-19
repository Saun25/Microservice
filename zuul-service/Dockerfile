FROM openjdk:11

ADD ./target/zuul-service-0.0.1-SNAPSHOT.jar /usr/src/zuul-service-0.0.1-SNAPSHOT.jar

WORKDIR usr/src

EXPOSE 8081

ENTRYPOINT ["java","-jar", "zuul-service-0.0.1-SNAPSHOT.jar"]