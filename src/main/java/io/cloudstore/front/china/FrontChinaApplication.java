package io.cloudstore.front.china;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

/**
 * @author chanwook
 */
@SpringBootApplication
public class FrontChinaApplication {

    @Autowired
    Environment env;

    public static void main(String[] args) {
        SpringApplication.run(FrontChinaApplication.class, args);
    }
}
