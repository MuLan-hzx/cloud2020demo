package org.mulan.cloud2020demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 韩志雄
 * @date 2021/4/12 22:17
 */
@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaServer7001 {

	public static void main(String[] args) {
		SpringApplication.run(CloudEurekaServer7001.class,args);
	}
}
