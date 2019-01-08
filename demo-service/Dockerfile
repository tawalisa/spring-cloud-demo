FROM java:8-jre
MAINTAINER taw <tawalisa@163.com>

ADD ./target/service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/service.jar"]

