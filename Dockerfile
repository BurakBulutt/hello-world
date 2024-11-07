FROM openjdk:17

WORKDIR /app

COPY target/*jar hello_world.jar

EXPOSE 8085

ENTRYPOINT ["java", "-jar", "hello_world.jar"]