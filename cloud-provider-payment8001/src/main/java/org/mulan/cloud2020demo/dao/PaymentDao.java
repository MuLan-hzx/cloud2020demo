package org.mulan.cloud2020demo.dao;

import org.mulan.cloud2020demo.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author 韩志雄
 * @date 2021/4/12 14:15
 */
@Mapper
@Repository
public interface PaymentDao {

	int create(Payment payment);

	Payment getPaymentById(@Param("id") long id);

}
