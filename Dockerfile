FROM maven:3.5.4-jdk-8-alpine

COPY . appsensor

WORKDIR appsensor
RUN mvn -N install && mvn test
RUN cd .. && rm -rf appsensor


