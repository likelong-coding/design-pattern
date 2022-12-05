package com.lkl.design.strategy.service.impl;

import com.lkl.design.strategy.service.PayService;
import com.lkl.design.strategy.service.PayStrategyFactory;
import com.lkl.design.strategy.service.pay.PayStrategy;
import org.springframework.stereotype.Service;

@Service("payService")
public class PayServiceImpl implements PayService {

    @Override
    public String pay(String channel, String amount) {
        PayStrategy payStrategy = PayStrategyFactory.getPayStrategy(channel);
        if (payStrategy == null) {
            return "输入渠道码有误";
        }
        return payStrategy.pay(channel, amount);
    }
}
