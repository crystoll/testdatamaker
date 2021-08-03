FROM openjdk:17 as packager

# First stage: JDK 7 with modules required for Spring Boot
RUN /usr/java/openjdk-17/bin/jlink \
    --module-path /usr/java/openjdk-17/jmods \
    --verbose \
    --add-modules java.base,java.logging,java.xml,jdk.unsupported,java.sql,java.naming,java.desktop,java.management,java.security.jgss,java.instrument \
    --compress 2 \
    --no-header-files \
    --output /opt/jdk-17-minimal

# Second stage, add only our custom jdk9 distro and our app
FROM openjdk:17
COPY --from=packager /opt/jdk-17-minimal /opt/jdk-17-minimal
COPY target/*.jar /opt/

ENV JAVA_HOME=/opt/jdk-17-minimal
ENV PATH="$PATH:$JAVA_HOME/bin"

EXPOSE 8080
CMD java -jar /opt/*.jar
#CMD java --version



