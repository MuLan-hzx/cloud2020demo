package org.mulan.cloud2020demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author 韩志雄
 * @date 2021/4/16 16:56
 */
@RestController
public class PaymentController
{
	@Value("${server.port}")
	private String serverPort;

	@RequestMapping(value = "/payment/consul")
	public String paymentConsul()
	{
		return "springcloud with consul: "+serverPort+"\t"+ UUID.randomUUID().toString();
	}
}

