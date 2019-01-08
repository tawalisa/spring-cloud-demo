#! /bin/bash

if [ ! -e /config/.git ]; then
  cd /config && git init && git add . && git -c user.name='tawalisa' -c user.email='tawalisa@163.com' commit -m "initial" && cd -
fi

java -Xmx128m -Xms128m -Djava.security.egd=file:/dev/./urandom -jar /app/config.jar