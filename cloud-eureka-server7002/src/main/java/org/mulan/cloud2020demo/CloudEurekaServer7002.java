package org.mulan.cloud2020demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 韩志雄
 * @date 2021/4/12 23:28
 */
@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaServer7002 {
	public static void main(String[] args) {
		SpringApplication.run(CloudEurekaServer7002.class,args);
	}
}
