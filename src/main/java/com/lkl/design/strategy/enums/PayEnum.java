package com.lkl.design.strategy.enums;

public enum PayEnum {

    ALI_PAY("ali", "支付宝支付", "aliPayStrategy"),
    WECHAT_PAY("wechat", "微信支付", "wechatPayStrategy"),
    UNION_PAY("union", "银联支付", "unionPayStrategy"),
    XIAO_MI_PAY("xiaomi", "小米支付", "xiaomiPayStrategy");

    public String getBeanName() {
        return beanName;
    }

    /**
     * 策略实现类对应的 beanName
     */
    private String beanName;

    /**
     * 通过渠道码获取枚举
     */
    public static PayEnum findPayEnumByChannel(String channel) {
        PayEnum[] enums = PayEnum.values();
        for (PayEnum payEnum : enums) {
            if (payEnum.getChannel().equals(channel)) {
                return payEnum;
            }
        }
        return null;
    }

    PayEnum(String channel, String description) {
        this.channel = channel;
        this.description = description;
    }

    PayEnum(String channel, String description, String beanName) {
        this.channel = channel;
        this.description = description;
        this.beanName = beanName;
    }

    /**
     * 渠道
     */
    private String channel;
    /**
     * 描述
     */
    private String description;

    public String getChannel() {
        return channel;
    }

    public String getDescription() {
        return description;
    }


}
