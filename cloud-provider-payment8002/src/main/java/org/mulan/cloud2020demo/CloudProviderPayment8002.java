package org.mulan.cloud2020demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 韩志雄
 * @date 2021/4/13 0:56
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudProviderPayment8002 {
	public static void main(String[] args) {
		SpringApplication.run(CloudProviderPayment8002.class,args);
	}
}
