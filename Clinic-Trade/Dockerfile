FROM java:8
VOLUME /tmp
ADD target/clinic-trade.jar clinic-trade.jar
ENTRYPOINT ["java","-jar","/clinic-trade.jar"]
EXPOSE 9010