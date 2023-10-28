#FROM openjdk:20
#
#VOLUME /tmp
#EXPOSE 8080
#
#WORKDIR /app
#COPY .mvn/ .mvn
#COPY mvnw pom.xml ./
#COPY src ./src
#RUN ./mvnw dependency:resolve
#
##FROM base as development
#CMD ["./mvnw", "spring-boot:run", "-Dspring-boot.run.profiles=mysql", "-Dspring-boot.run.jvmArguments='-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5432'"]

# Stage 1: Build the application using Maven
FROM maven:3.9.2-eclipse-temurin-20 AS build
#SHELL ["cmd", "/S", "/C"]

WORKDIR /app
COPY .mvn/ app/mvn
COPY src/ app/src
COPY mvnw pom.xml ./
RUN mvn -B -DskipTests clean package

# Stage 2: Create the final Docker image
FROM openjdk:20
WORKDIR /app
COPY --from=build /app/target/StoreSpring.jar /app/StoreSpring.jar
EXPOSE 8080
CMD ["java", "-jar", "StoreSpring.jar"]

