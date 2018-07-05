FROM prozachj/appsensor-build

COPY . appsensor-ui
WORKDIR appsensor-ui
RUN mvn package
RUN mv target/appsensor-ui-2.3.3.jar /app.jar
RUN cd ../ && rm -rf appsensor-ui
ENV APPSENSOR_WEB_SOCKET_HOST_URL=ws://localhost:8085/dashboard
ENV APPSENSOR_REST_REPORTING_ENGINE_URL=http://localhost:8085
ENV APPSENSOR_CLIENT_APPLICATION_ID_HEADER_NAME=X-Appsensor-Client-Application-Name2
ENV APPSENSOR_CLIENT_APPLICATION_ID_HEADER_VALUE=myclientapp
ENV APPSENSOR_WEB_SOCKET_HOST_URL=ws://localhost:8085/dashboard
ENV spring.datasource.url=jdbc:mysql://localhost/appsensor
ENV spring.datasource.username=appsensor_user
ENV spring.datasource.password=appsensor_pass

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
