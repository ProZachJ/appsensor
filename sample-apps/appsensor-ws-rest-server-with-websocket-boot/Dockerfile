FROM prozachj/appsensor-build

COPY . .
RUN mvn package && cp target/appsensor-ws-rest-server-with-websocket-boot-0.0.1-SNAPSHOT.jar /tmp/app.jar
RUN bash -c 'touch /tmp/app.jar'
ENV APPSENSOR_WEB_SOCKET_HOST_URL=ws://localhost:8085/dashboard
