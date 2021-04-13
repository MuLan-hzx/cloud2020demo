package org.mulan.cloud2020demo.controller;

import org.mulan.cloud2020demo.entities.CommonResult;
import org.mulan.cloud2020demo.entities.Payment;
import org.mulan.cloud2020demo.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author 韩志雄
 * @date 2021/4/12 14:38
 */
@RestController
@Slf4j
public class PaymentController {

	@Resource
	private PaymentService paymentService;

	@Value("${server.port}")
	private String serverPort;

	@PostMapping("/payment/create")
	public CommonResult<Payment> create(@RequestBody Payment payment){
		CommonResult commonResult;
		int result = paymentService.create(payment);
		if(result == 1) {
			commonResult = new CommonResult(200, "插入成功！port="+serverPort);
			log.info("成功插入一条记录！");
			return commonResult;
		}
		commonResult = new CommonResult(200, "插入失败！port="+serverPort);
		log.info("插入一条记录失败！");
		return commonResult;
	}

	@GetMapping("/payment/{id}")
	public CommonResult<Payment> getPaymentById(@PathVariable Long id){
		CommonResult commonResult;
		Payment payment = paymentService.getPaymentById(id);
		if(payment != null) {
			commonResult = new CommonResult(200, "查询成功！port="+serverPort,payment);
			log.info(payment.toString());
			return commonResult;
		}
		commonResult = new CommonResult(200, "查询失败！port="+serverPort,null);
		log.info("查询id为"+id+"的一条记录失败！");
		return commonResult;
	}
}
