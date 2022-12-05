package com.lkl.design.strategy.service.pay;

import com.lkl.design.strategy.enums.PayEnum;
import org.springframework.stereotype.Component;

@Component("xiaomiPayStrategy")
public class XiaomiPayStrategyImpl implements PayStrategy {
    @Override
    public String pay(String channel, String amount) {
        return String.format(MSG, PayEnum.XIAO_MI_PAY.getDescription(), amount);
    }
}
