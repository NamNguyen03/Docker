FROM maven:latest
RUN mkdir /source
WORKDIR /source
COPY . .
RUN mvn install
CMD ["java", "-jar", "target/MyBackEnd-0.0.1-SNAPSHOT.jar"]
