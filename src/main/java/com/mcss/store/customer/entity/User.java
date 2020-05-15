package com.mcss.store.customer.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Arron
 * @since 2020-05-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_user")
@ApiModel(value="User对象", description="用户信息")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "用户的唯一标识")
    private String openId;

    @ApiModelProperty(value = "会话密钥")
    private String sessionKey;

    @ApiModelProperty(value = "用户昵称")
    private String nickName;

    @ApiModelProperty(value = "用户链接")
    private String avatarUrl;

    @ApiModelProperty(value = "性别   0 男  1  女")
    private Boolean gender;

    @ApiModelProperty(value = "所在国家")
    private String country;

    @ApiModelProperty(value = "省份")
    private String province;

    @ApiModelProperty(value = "城市")
    private String city;

    @ApiModelProperty(value = "语言")
    private String language;

    @ApiModelProperty(value = "手机类型")
    private String mobile;

    @ApiModelProperty(value = "手机号码")
    private String telNum;

    @ApiModelProperty(value = "创建人")
    private String createdUser;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createdTime;

    @ApiModelProperty(value = "修改执行人")
    private String modifiedUser;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime modifiedTime;


}
