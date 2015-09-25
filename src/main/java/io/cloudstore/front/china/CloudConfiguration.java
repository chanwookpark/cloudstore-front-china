package io.cloudstore.front.china;

import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Configuration;

/**
 * @author chanwook
 */
@Configuration
@EnableEurekaClient
@EnableCircuitBreaker
@EnableHystrixDashboard //TODO 별도 서버로 뽑아내자
@EnableFeignClients
public class CloudConfiguration {
}
