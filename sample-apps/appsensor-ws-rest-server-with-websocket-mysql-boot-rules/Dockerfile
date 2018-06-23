FROM maven:3.5.4-jdk-8-alpine

COPY . ~/app
WORKDIR ~/app
RUN mvn package
RUN cp target/appsensor-ws-rest-server-with-websocket-mysql-boot-rules-0.0.1-SNAPSHOT.jar /tmp/appsensor-ws-rest-server-with-websocket-mysql-boot-rules-0.0.1-SNAPSHOT.jar
RUN cd .. && rm -rf ~/app

ENV APPSENSOR_WEB_SOCKET_HOST_URL=ws://localhost:8085/dashboard
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/tmp/appsensor-ws-rest-server-with-websocket-mysql-boot-rules-0.0.1-SNAPSHOT.jar"]


