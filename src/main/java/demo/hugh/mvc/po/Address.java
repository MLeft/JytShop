package demo.hugh.mvc.po;

public class Address {
    /**
     * <pre>
     * 
     * 表字段 : address.id
     * </pre>
     * 
     */
    private Integer id;

    /**
     * <pre>
     * 收货人姓名
     * 表字段 : address.name
     * </pre>
     * 
     */
    private String name;

    /**
     * <pre>
     * 
     * 表字段 : address.mobile
     * </pre>
     * 
     */
    private String mobile;

    /**
     * <pre>
     * 
     * 表字段 : address.address
     * </pre>
     * 
     */
    private String address;

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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}