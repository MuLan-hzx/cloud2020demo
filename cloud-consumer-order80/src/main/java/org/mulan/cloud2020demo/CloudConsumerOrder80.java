package org.mulan.cloud2020demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 韩志雄
 * @date 2021/4/12 17:59
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudConsumerOrder80 {

	public static void main(String[] args) {
		SpringApplication.run(CloudConsumerOrder80.class,args);
	}
}
