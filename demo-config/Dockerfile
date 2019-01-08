FROM java:8-jre
MAINTAINER taw <tawalisa@163.com>

ADD ./target/config.jar /app/

COPY entrypoint.sh /entrypoint.sh
ENTRYPOINT ["/bin/sh", "/entrypoint.sh"]
