FROM java:8-jre
MAINTAINER taw <tawalisa@163.com>

ADD ./target/feign.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/feign.jar"]

EXPOSE 8080
