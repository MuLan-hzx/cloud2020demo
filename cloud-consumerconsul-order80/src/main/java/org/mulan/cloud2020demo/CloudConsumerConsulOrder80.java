package org.mulan.cloud2020demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 韩志雄
 * @date 2021/4/16 22:11
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudConsumerConsulOrder80 {
	public static void main(String[] args) {
		SpringApplication.run(CloudConsumerConsulOrder80.class,args);
	}
}
