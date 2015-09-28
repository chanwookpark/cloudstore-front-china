package store.appleshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

/**
 * @author chanwook
 */
@SpringBootApplication
public class AppleShopApplication {

    @Autowired
    Environment env;

    public static void main(String[] args) {
        SpringApplication.run(AppleShopApplication.class, args);
    }
}
