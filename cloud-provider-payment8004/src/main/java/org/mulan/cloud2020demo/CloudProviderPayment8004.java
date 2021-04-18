package org.mulan.cloud2020demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 韩志雄
 * @date 2021/4/16 16:54
 */
@SpringBootApplication
@EnableDiscoveryClient //该注解用于向使用consul或者zookeeper作为注册中心时注册服务
public class CloudProviderPayment8004 {
	public static void main(String[] args) {
		SpringApplication.run(CloudProviderPayment8004.class,args);
	}
}
