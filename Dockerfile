FROM openjdk:8-jdk-alpine
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
VOLUME /tmp
EXPOSE 8080
LABEL maintainer1="José C. Ureña <20160138@ce.pucmm.edu.do>"
LABEL maintainer2="José R. docker Ureña <20102196@ce.pucmm.edu.do>"

