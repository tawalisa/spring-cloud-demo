cd demo-config/config && git init && git add . && git -c user.name='tawalisa' -c user.email='tawalisa@163.com' commit -m "initial"
cd ../../demo-config && docker build -t tawalisa/config .
cd ../demo-eureka && docker build -t tawalisa/eureka .
cd ../demo-feign && docker build -t tawalisa/feign .
cd ../demo-service && docker build -t tawalisa/service .