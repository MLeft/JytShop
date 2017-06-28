package demo.hugh.mvc.po;

import java.math.BigDecimal;

public class Goods {
    /**
     * <pre>
     * 
     * 表字段 : goods.id
     * </pre>
     * 
     */
    private Integer id;

    /**
     * <pre>
     * 
     * 表字段 : goods.name
     * </pre>
     * 
     */
    private String name;

    /**
     * <pre>
     * 
     * 表字段 : goods.description
     * </pre>
     * 
     */
    private String description;

    /**
     * <pre>
     * 价格
     * 表字段 : goods.price
     * </pre>
     * 
     */
    private BigDecimal price;

    /**
     * <pre>
     * 库存数量
     * 表字段 : goods.quantity
     * </pre>
     * 
     */
    private Integer quantity;

    /**
     * <pre>
     * 00-正常; 01-已下架;
     * 表字段 : goods.state
     * </pre>
     * 
     */
    private String state;

    /**
     * <pre>
     * 
     * 表字段 : goods.pic_url
     * </pre>
     * 
     */
    private String picUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }
}