package com.lkl.design.strategy.service.pay;

public interface PayStrategy {
    String MSG = "使用 %s ,消费了 %s 元";

    String pay(String channel, String amount);
}
