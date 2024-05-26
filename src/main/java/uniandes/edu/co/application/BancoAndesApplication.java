package uniandes.edu.co.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class BancoAndesApplication {
    public static void main(String[] args) {
        SpringApplication.run(BancoAndesApplication.class, args);
    }
}
