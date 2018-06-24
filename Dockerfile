FROM maven:3.5.4-jdk-8-alpine

COPY . appsensor

RUN cd appsensor && mvn install -DskipTests=true -Dmaven.javadoc.skip=true -B -V
RUN rm -rf appsensor


