package com.dnp.test.modular.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户
 * </p>
 *
 * @author huazai
 * @since 2018-11-15
 */
@XmlRootElement(name = "user")
@XmlAccessorType(XmlAccessType.NONE)
@ApiModel(value = "user", description = "用户")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)

    @XmlAttribute
    @ApiModelProperty(value = "主键id", dataType = "Long")
    private Long id;
    /**
     * 登陆名
     */

    @XmlAttribute
    @ApiModelProperty(value = "登陆名", dataType = "String")
    private String loginName;
    /**
     * 用户名
     */

    @XmlAttribute
    @ApiModelProperty(value = "用户名", dataType = "String")
    private String username;
    /**
     * 密码
     */

    @XmlAttribute
    @ApiModelProperty(value = "密码", dataType = "String")
    private String password;
    /**
     * 密码加密盐
     */

    @XmlAttribute
    @ApiModelProperty(value = "密码加密盐", dataType = "String")
    private String salt;
    /**
     * 性别
     */

    @XmlAttribute
    @ApiModelProperty(value = "性别", dataType = "Integer")
    private Integer sex;
    /**
     * 年龄
     */

    @XmlAttribute
    @ApiModelProperty(value = "年龄", dataType = "Integer")
    private Integer age;
    /**
     * 手机号
     */

    @XmlAttribute
    @ApiModelProperty(value = "手机号", dataType = "String")
    private String phone;
    /**
     * 用户类别
     */

    @XmlAttribute
    @ApiModelProperty(value = "用户类别", dataType = "Integer")
    private Integer userType;
    /**
     * 用户状态
     */

    @XmlAttribute
    @ApiModelProperty(value = "用户状态", dataType = "Integer")
    private Integer status;
    /**
     * 所属机构
     */

    @XmlAttribute
    @ApiModelProperty(value = "所属机构", dataType = "Integer")
    private Integer organizationId;
    /**
     * 创建时间
     */

    @XmlAttribute
    @ApiModelProperty(value = "创建时间", dataType = "LocalDateTime")
    private LocalDateTime createTime;

    public User() {
    }

    public User(@Size(max = 20, message = ",字段长度小于20") @NotNull(message = "登录名称不能为空") String loginName, String name, @Pattern(regexp = "^.*(?=.{6,})(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%^&*? ]).*$",
            message = ":密码长度至少6位，必须包含一个数字字母和特殊字符") String password, Integer sex, Integer age, String phone, Integer userType, Integer organizationId) {
    }

    public String getUsername() {
        return username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
