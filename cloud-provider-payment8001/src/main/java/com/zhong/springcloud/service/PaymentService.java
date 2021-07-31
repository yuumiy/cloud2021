package com.zhong.springcloud.service;

import com.zhong.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(Long id);
}
