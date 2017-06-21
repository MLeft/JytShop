package demo.hugh.mvc.po;

public class User {
    /**
     * <pre>
     * 
     * 表字段 : user.id
     * </pre>
     * 
     */
    private Integer id;

    /**
     * <pre>
     * 
     * 表字段 : user.name
     * </pre>
     * 
     */
    private String name;

    /**
     * <pre>
     * 
     * 表字段 : user.mobile
     * </pre>
     * 
     */
    private Long mobile;

    /**
     * <pre>
     * 
     * 表字段 : user.password
     * </pre>
     * 
     */
    private String password;

    /**
     * <pre>
     * 
     * 表字段 : user.openid
     * </pre>
     * 
     */
    private String openid;

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

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }
}