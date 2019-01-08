FROM java:8-jre
MAINTAINER taw <tawalisa@163.com>

ADD ./target/config.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/config.jar"]
