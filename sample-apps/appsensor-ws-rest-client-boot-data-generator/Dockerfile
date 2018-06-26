FROM prozachj/appsensor-build

COPY . generator

WORKDIR  generator
RUN mvn install && mvn test 

CMD ["mvn","spring-boot:run", "-D","APPSENSOR_WEB_SOCKET_HOST_URL=ws://localhost:8085/dashboard"]
EXPOSE 8085
