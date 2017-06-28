package demo.hugh.mvc.po;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    /**
     * <pre>
     * 订单号
     * 表字段 : order.order_id
     * </pre>
     * 
     */
    private String orderId;

    /**
     * <pre>
     * 
     * 表字段 : order.user_id
     * </pre>
     * 
     */
    private Integer userId;

    /**
     * <pre>
     * 
     * 表字段 : order.address_id
     * </pre>
     * 
     */
    private Integer addressId;

    /**
     * <pre>
     * 商品清单--"商品1id*商品1数量;商品2id*商品2数量"
     * 表字段 : order.goods_list
     * </pre>
     * 
     */
    private String goodsList;

    /**
     * <pre>
     * 商品总价
     * 表字段 : order.total_amt
     * </pre>
     * 
     */
    private BigDecimal totalAmt;

    /**
     * <pre>
     * 订单状态: 00 待支付; 01 支付中; 02 已支付; 03 已发货; 04 已收货; 05 已评论
     * 表字段 : order.state
     * </pre>
     * 
     */
    private String state;

    /**
     * <pre>
     * 0001-实名支付; 0002-信运付
     * 表字段 : order.pay_channel
     * </pre>
     * 
     */
    private String payChannel;

    /**
     * <pre>
     * 支付订单号
     * 表字段 : order.pay_order_id
     * </pre>
     * 
     */
    private String payOrderId;

    /**
     * <pre>
     * 
     * 表字段 : order.channel_state
     * </pre>
     * 
     */
    private String channelState;

    /**
     * <pre>
     * 
     * 表字段 : order.channel_resp_code
     * </pre>
     * 
     */
    private String channelRespCode;

    /**
     * <pre>
     * 
     * 表字段 : order.channel_resp_desc
     * </pre>
     * 
     */
    private String channelRespDesc;

    /**
     * <pre>
     * 
     * 表字段 : order.create_time
     * </pre>
     * 
     */
    private Date createTime;

    /**
     * <pre>
     * 支付完成时间
     * 表字段 : order.pay_end_time
     * </pre>
     * 
     */
    private Date payEndTime;

    /**
     * <pre>
     * 发货时间
     * 表字段 : order.deliver_time
     * </pre>
     * 
     */
    private Date deliverTime;

    /**
     * <pre>
     * 确认收货时间
     * 表字段 : order.take_over_time
     * </pre>
     * 
     */
    private Date takeOverTime;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(String goodsList) {
        this.goodsList = goodsList;
    }

    public BigDecimal getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(BigDecimal totalAmt) {
        this.totalAmt = totalAmt;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public String getPayOrderId() {
        return payOrderId;
    }

    public void setPayOrderId(String payOrderId) {
        this.payOrderId = payOrderId;
    }

    public String getChannelState() {
        return channelState;
    }

    public void setChannelState(String channelState) {
        this.channelState = channelState;
    }

    public String getChannelRespCode() {
        return channelRespCode;
    }

    public void setChannelRespCode(String channelRespCode) {
        this.channelRespCode = channelRespCode;
    }

    public String getChannelRespDesc() {
        return channelRespDesc;
    }

    public void setChannelRespDesc(String channelRespDesc) {
        this.channelRespDesc = channelRespDesc;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPayEndTime() {
        return payEndTime;
    }

    public void setPayEndTime(Date payEndTime) {
        this.payEndTime = payEndTime;
    }

    public Date getDeliverTime() {
        return deliverTime;
    }

    public void setDeliverTime(Date deliverTime) {
        this.deliverTime = deliverTime;
    }

    public Date getTakeOverTime() {
        return takeOverTime;
    }

    public void setTakeOverTime(Date takeOverTime) {
        this.takeOverTime = takeOverTime;
    }
}