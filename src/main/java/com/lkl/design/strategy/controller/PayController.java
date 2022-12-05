package com.lkl.design.strategy.controller;

import com.lkl.design.strategy.service.PayService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 示例链接：
 * https://cloud.tencent.com/developer/article/1701938
 */
@RestController
@RequestMapping("/xiaoniu")
public class PayController {

    @Resource(name = "payService")
    private PayService payService;

    /**
     * 支付接口
     *
     * @param channel 渠道
     * @param amount  消费金额
     * @return String 返回消费结果
     */
    @RequestMapping("/pay")
    public String pay(@RequestParam(name = "channel") String channel,
                      @RequestParam(name = "amount") String amount) {
        return payService.pay(channel, amount);
    }
}
