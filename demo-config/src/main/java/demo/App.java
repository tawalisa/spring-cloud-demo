package demo;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class App {
	protected final static Log logger = LogFactory.getLog(App.class);
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}