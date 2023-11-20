FROM openjdk:11
LABEL authors="saranya.kalaiselvan"
WORKDIR /crackit
COPY src/main/resources/application-cloud.properties /crackit/application-cloud.properties
COPY target/ExternalizationDemo-0.0.1-SNAPSHOT.jar /crackit/application.jar
EXPOSE 9080
ENTRYPOINT ["java", "-jar", "application.jar", "--spring-profiles-active=cloud"]