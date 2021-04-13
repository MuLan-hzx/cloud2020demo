package org.mulan.cloud2020demo.controllers;

import org.mulan.cloud2020demo.entities.CommonResult;
import org.mulan.cloud2020demo.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author 韩志雄
 * @date 2021/4/12 18:02
 */
@RestController
@Slf4j
public class OrderController {
//	public static final String BASE_URL="http://localhost:8001";
	public static final String PAYMENT_URL="http://CLOUD-PAYMENT-SERVICE";

	@Resource
	private RestTemplate restTemplate;

	@GetMapping("/consumer/payment/create")
	public CommonResult<Payment> create(Payment payment){
		return restTemplate.postForObject(PAYMENT_URL+"/create",payment,CommonResult.class);
	}

	@GetMapping("/consumer/payment/{id}")
	public CommonResult<Payment> getPayment(@PathVariable long id){
		return restTemplate.getForObject(PAYMENT_URL+"/payment/"+id,CommonResult.class);
	}
}
