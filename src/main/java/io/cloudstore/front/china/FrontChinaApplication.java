package io.cloudstore.front.china;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.core.env.Environment;

/**
 * @author chanwook
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
@EnableHystrixDashboard //TODO 별도 서버로 뽑아내자
public class FrontChinaApplication {

    @Autowired
    Environment env;

    public static void main(String[] args) {
        SpringApplication.run(FrontChinaApplication.class, args);
    }
}
