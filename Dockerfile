FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/sb.war sb.war
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar /sb.war" ]