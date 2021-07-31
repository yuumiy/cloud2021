package com.zhong.springcloud.controller;

import com.zhong.springcloud.entity.CommonResult;
import com.zhong.springcloud.entity.Payment;
import com.zhong.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController   //Controller一般跳转页面，RestController返回String、Object
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getById(@PathVariable("id") Long id){
        Payment payment=paymentService.getPaymentById(id);
        if(payment != null){
            return new CommonResult(200,"查询成功",payment);
        }else {
            return new CommonResult(444,"查询id:"+id+"失败");
        }
    }

    @PostMapping(value = "/payment/create")
    public CommonResult create(Payment payment){
        int result=paymentService.create(payment);
        log.info("result:"+result);
        if(result > 0){
            return new CommonResult(200,"添加成功",payment);
        }else {
            return new CommonResult(444,"添加失败");
        }
    }
}
