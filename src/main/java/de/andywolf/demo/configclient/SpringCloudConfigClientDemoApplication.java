package de.andywolf.demo.configclient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SpringCloudConfigClientDemoApplication implements CommandLineRunner {

    @Value("${my.local.test.key}")
    private String myTestKey;

    @Value("${app.name}")
    private String myAppName;

    @Value("${environment}")
    private String myEnvironment;

    @Value("${db.name}")
    private String myDbName;

    @Value("${db.username}")
    private String myDbUsername;

    @Value("${db.password}")
    private String myDbPassword;

    @Value("${db.url}")
    private String myDbURL;

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigClientDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("My local test key: " + myTestKey);
        log.info("App Name: " + myAppName);
        log.info("Environment: " + myEnvironment);
        log.info("Database Name: " + myDbName);
        log.info("DB Username: " + myDbUsername);
        log.info("DB Password: " + myDbPassword);
        log.info("DB URL: " + myDbURL);

    }
}
