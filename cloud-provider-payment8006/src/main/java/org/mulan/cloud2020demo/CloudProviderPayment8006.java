package org.mulan.cloud2020demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 韩志雄
 * @date 2021/4/16 21:51
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudProviderPayment8006 {
	public static void main(String[] args) {
		SpringApplication.run(CloudProviderPayment8006.class,args);
	}
}
