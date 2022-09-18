package com.wjiangquan.springcloud.controller;

import com.wjiangquan.springcloud.entities.CommonResult;
import com.wjiangquan.springcloud.entities.Payment;
import com.wjiangquan.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author weijiangquan
 * @date 2022/9/17 -12:41
 * @Description
 */

@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("插入结果是:"+result);


        if(result>0){
            return new CommonResult(200,"数据库插入成功",result);
        }else {
            return new CommonResult(444,"插入数据失败",null);

        }
    }



    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("插入结果是:"+payment);

        if(payment!=null){
            return new CommonResult(200,"查询成功",payment);
        }else {
            return new CommonResult(444,"没有对应的查询记录"+id,null);
        }
    }


}
