package demo.feign;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@ComponentScan
@RestController
@RefreshScope
@SpringBootApplication
@EnableFeignClients
public class ClientFeignApp {
	@Autowired
    private GreetingClient greetingClient;
 
    public static void main(String[] args) {
        SpringApplication.run(ClientFeignApp.class, args);
    }
 
    @Autowired
    private DiscoveryClient discoveryClient;

    public String serviceUrl() {
        List<ServiceInstance> list = discoveryClient.getInstances("spring-cloud-eureka-client");
        if (list != null && list.size() > 0 ) {
            return list.get(0).getUri().toString();
        }
        return null;
    }
    @RequestMapping("/get-greeting")
    public String greeting() {
        return "hello: "+greetingClient.greeting();
        
//        return "hello: "+serviceUrl();
    }
    
}