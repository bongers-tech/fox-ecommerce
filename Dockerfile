FROM maven:3.6.3-jdk-11 as build
COPY pom.xml /tmp/
COPY fox-core /tmp/fox-core/
COPY fox-api /tmp/fox-api/
WORKDIR /tmp
RUN mvn clean package -DskipTests=true

FROM openjdk:11
COPY --from=build /tmp/fox-api/target/*.jar ./
EXPOSE 9090

# Run jar
ENTRYPOINT ["java","-jar","fox-api.jar"]
