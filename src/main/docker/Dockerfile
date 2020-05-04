FROM jboss/wildfly:19.0.0.Final
COPY maven/helloworld-mp.war /opt/jboss/wildfly/standalone/deployments/
EXPOSE 8080
EXPOSE 9990
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-c", "standalone-microprofile.xml", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]
