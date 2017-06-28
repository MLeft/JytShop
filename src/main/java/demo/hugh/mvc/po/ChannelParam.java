package demo.hugh.mvc.po;

public class ChannelParam {
    /**
     * <pre>
     * 支付渠道
     * 表字段 : channel_param.pay_channel
     * </pre>
     * 
     */
    private String payChannel;

    /**
     * <pre>
     * 
     * 表字段 : channel_param.pay_channel_name
     * </pre>
     * 
     */
    private String payChannelName;

    /**
     * <pre>
     * 
     * 表字段 : channel_param.merchant_id
     * </pre>
     * 
     */
    private String merchantId;

    /**
     * <pre>
     * 我方私钥
     * 表字段 : channel_param.private_key
     * </pre>
     * 
     */
    private String privateKey;

    /**
     * <pre>
     * 渠道公钥
     * 表字段 : channel_param.channel_publict_key
     * </pre>
     * 
     */
    private String channelPublictKey;

    /**
     * <pre>
     * 
     * 表字段 : channel_param.pay_url
     * </pre>
     * 
     */
    private String payUrl;

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public String getPayChannelName() {
        return payChannelName;
    }

    public void setPayChannelName(String payChannelName) {
        this.payChannelName = payChannelName;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getChannelPublictKey() {
        return channelPublictKey;
    }

    public void setChannelPublictKey(String channelPublictKey) {
        this.channelPublictKey = channelPublictKey;
    }

    public String getPayUrl() {
        return payUrl;
    }

    public void setPayUrl(String payUrl) {
        this.payUrl = payUrl;
    }
}