package demo.hugh.mvc.po;

import java.util.Date;

public class Cart {
    /**
     * <pre>
     * 
     * 表字段 : cart.id
     * </pre>
     * 
     */
    private Integer id;

    /**
     * <pre>
     * 
     * 表字段 : cart.user_id
     * </pre>
     * 
     */
    private Integer userId;

    /**
     * <pre>
     * 
     * 表字段 : cart.goods_id
     * </pre>
     * 
     */
    private Integer goodsId;

    /**
     * <pre>
     * 购买件数
     * 表字段 : cart.quantity
     * </pre>
     * 
     */
    private Integer quantity;

    /**
     * <pre>
     * 是否被用户选中: 0 未选中; 1 选中
     * 表字段 : cart.selected
     * </pre>
     * 
     */
    private Boolean selected;

    /**
     * <pre>
     * 
     * 表字段 : cart.create_time
     * </pre>
     * 
     */
    private Date createTime;

    /**
     * <pre>
     * 
     * 表字段 : cart.update_time
     * </pre>
     * 
     */
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}