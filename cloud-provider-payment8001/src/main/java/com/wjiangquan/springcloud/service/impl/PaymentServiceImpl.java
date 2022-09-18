package com.wjiangquan.springcloud.service.impl;

import com.wjiangquan.springcloud.dao.PaymentDao;
import com.wjiangquan.springcloud.entities.Payment;
import com.wjiangquan.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author weijiangquan
 * @date 2022/9/17 -12:40
 * @Description
 */

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
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
