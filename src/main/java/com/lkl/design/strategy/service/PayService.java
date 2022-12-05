package com.lkl.design.strategy.service;

public interface PayService {

    String MSG = "使用 %s ,消费了 %s 元";
    /**
    * 支付接口
    * @param channel 渠道
    * @param amount  金额
    */
    String pay(String channel,String amount);
}
