package com.wjiangquan.springcloud.service;

import com.wjiangquan.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author weijiangquan
 * @date 2022/9/17 -12:38
 * @Description
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);


}
