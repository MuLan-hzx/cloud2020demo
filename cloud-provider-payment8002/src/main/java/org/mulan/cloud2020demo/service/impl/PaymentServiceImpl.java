package org.mulan.cloud2020demo.service.impl;

import org.mulan.cloud2020demo.dao.PaymentDao;
import org.mulan.cloud2020demo.entities.Payment;
import org.mulan.cloud2020demo.service.PaymentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author 韩志雄
 * @date 2021/4/12 14:32
 */
@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {

	@Resource
	private PaymentDao paymentDao;

	@Override
	public int create(Payment payment) {
		return paymentDao.create(payment);
	}

	@Override
	public Payment getPaymentById(Long id) {
		return paymentDao.getPaymentById(id);
	}
}
