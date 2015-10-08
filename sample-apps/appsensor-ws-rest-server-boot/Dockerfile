FROM java:8
VOLUME /tmp
RUN apt-get -qq update
RUN apt-get -qqy install git maven
RUN git clone https://github.com/ProZachJ/appsensor.git
RUN cd appsensor &&\
    git checkout complete_build &&\
    mvn -N install &&\
    mvn install &&\
    cd sample-apps/appsensor-ws-rest-server-boot &&\
    mvn package &&\
    mv target/appsensor-ws-rest-server-boot-0.0.1-SNAPSHOT.jar /app.jar
RUN rm -rf appsensor
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
