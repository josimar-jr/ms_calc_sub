# configures the builder container
FROM gradle:6.6-jdk11 as builder

WORKDIR /ms-sub/

COPY . .

RUN ./gradlew quarkusBuild

# starts configuring the runner container
FROM fabric8/java-alpine-openjdk11-jre as runner

ARG JAVA_PACKAGE=java-11-openjdk-headless
ARG RUN_JAVA_VERSION=1.3.8

ENV LANG='en_US.UTF-8' LANGUAGE='en_US:en'

# Configure the JAVA_OPTIONS, you can add -XshowSettings:vm to also display the heap size.
ENV JAVA_OPTIONS="-Dquarkus.http.host=0.0.0.0 -Djava.util.logging.manager=org.jboss.logmanager.LogManager"

COPY --from=builder /ms-sub/build/lib/* /deployments/lib/
COPY --from=builder /ms-sub/build/*-runner.jar /deployments/app.jar

EXPOSE 8080
USER 1001

ENTRYPOINT [ "/deployments/run-java.sh" ]
