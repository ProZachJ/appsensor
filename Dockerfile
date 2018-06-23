FROM maven:3.5.4-jdk-8-alpine

COPY . .

RUN mvn -N install && mvn test



