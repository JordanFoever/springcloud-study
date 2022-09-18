package com.wjiangquan.springcloud.dao;

import com.wjiangquan.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author weijiangquan
 * @date 2022/9/17 -12:11
 * @Description
 */

@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
