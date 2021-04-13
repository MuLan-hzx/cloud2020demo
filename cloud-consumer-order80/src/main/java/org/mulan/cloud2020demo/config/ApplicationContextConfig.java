package org.mulan.cloud2020demo.config;

import org.mulan.cloud2020demo.entities.CommonResult;
import org.mulan.cloud2020demo.entities.Payment;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author 韩志雄
 * @date 2021/4/12 18:05
 */
@Configuration
public class ApplicationContextConfig {


	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

}
