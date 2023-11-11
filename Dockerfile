#FROM postgres:latest AS db
#
#ENV POSTGRES_DB=flowers
#ENV POSTGRES_USER=postgres
#ENV POSTGRES_PASSWORD=postgres
#
#COPY init.sql /docker-entrypoint-initdb.d/
#HEALTHCHECK --interval=30s --timeout=30s CMD curl -f http://localhost:1488/ || exit 1

FROM maven:3.9.2-eclipse-temurin-20 AS build

WORKDIR /app
COPY .mvn/ ./mvn
COPY src/ ./src
COPY mvnw pom.xml ./
RUN mvn -B -DskipTests clean package

ARG CACHEBUST=1
FROM eclipse-temurin:17 AS run
WORKDIR /app
COPY --from=build /app/target/StoreSpring.jar /app/StoreSpring.jar
EXPOSE 5432
ENTRYPOINT ["java", "-jar", "StoreSpring.jar"]