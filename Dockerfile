#Should use alpine
#FROM openjdk:8-jre
FROM tomcat:8.0.20-jre8
COPY build/libs/cutedemo-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/cutedemo.war