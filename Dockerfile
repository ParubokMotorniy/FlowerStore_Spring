FROM maven:3.9.2-eclipse-temurin-20 AS build

WORKDIR /app
COPY .mvn/ ./mvn
COPY src/ ./src
COPY mvnw pom.xml ./
RUN mvn -B -DskipTests clean package
#RUN find . -print | sed -e 's;[^/]*/;|____;g;s;____|; |;g'

FROM openjdk:20

WORKDIR /app
COPY --from=build /app/target/StoreSpring.jar /app/StoreSpring.jar
HEALTHCHECK --interval=30s --timeout=30s CMD curl -f http://localhost:1488/ || exit 1
ENTRYPOINT ["java", "-jar", "StoreSpring.jar"]

