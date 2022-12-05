package com.lkl.design.strategy.service;

import com.lkl.design.strategy.enums.PayEnum;
import com.lkl.design.strategy.service.pay.PayStrategy;
import com.lkl.design.strategy.utils.SpringContextUtil;

public class PayStrategyFactory {
    /**
     * 通过渠道码获取支付策略具体实现类
     */
    public static PayStrategy getPayStrategy(String channel) {
        PayEnum payEnum = PayEnum.findPayEnumByChannel(channel);
        if (payEnum == null) {
            return null;
        }
        return SpringContextUtil.getBean(payEnum.getBeanName(), PayStrategy.class);
    }
}
