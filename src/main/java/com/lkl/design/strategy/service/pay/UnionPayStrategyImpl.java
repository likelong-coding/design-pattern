package com.lkl.design.strategy.service.pay;

import com.lkl.design.strategy.enums.PayEnum;
import org.springframework.stereotype.Component;

@Component("unionPayStrategy")
public class UnionPayStrategyImpl implements PayStrategy{
    @Override
    public String pay(String channel, String amount) {
        return String.format(MSG, PayEnum.UNION_PAY.getDescription(),amount);
    }
}
