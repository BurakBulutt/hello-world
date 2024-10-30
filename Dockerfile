FROM maven:3-amazoncorretto-17-alpine as build

WORKDIR /app

COPY . .

RUN mvn clean package

FROM openjdk:17-alpine

WORKDIR /app

COPY --from=build /app/target/*jar hello_world.jar

EXPOSE 8085

ENTRYPOINT ["java", "-jar", "hello_world.jar"]