package de.andywolf.demo.configclient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SpringCloudConfigClientDemoApplication implements CommandLineRunner {

    @Value("${my.test.key}")
    private String myTestKey;

    //@Value("${environment}")
    //private String myEnvironment;

    @Value("${rate}")
    private String rate;

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigClientDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("My Test Key: " + myTestKey);
        log.info("Rate: " + rate);
    }
}
