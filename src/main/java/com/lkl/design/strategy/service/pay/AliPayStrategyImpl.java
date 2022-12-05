package com.lkl.design.strategy.service.pay;

import com.lkl.design.strategy.enums.PayEnum;
import org.springframework.stereotype.Component;

@Component("aliPayStrategy")
public class AliPayStrategyImpl implements PayStrategy {
    @Override
    public String pay(String channel, String amount) {
        return String.format(MSG, PayEnum.ALI_PAY.getDescription(), amount);
    }
}
