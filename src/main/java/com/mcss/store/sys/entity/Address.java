package com.mcss.store.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
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
@TableName("t_address")
@ApiModel(value="Address对象", description="地址信息")
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "收货地址数据的id")
    @TableId(value = "aid", type = IdType.AUTO)
    private Integer aid;

    @ApiModelProperty(value = "归属用户的id")
    private Integer uid;

    @ApiModelProperty(value = "收货人姓名")
    private String name;

    @ApiModelProperty(value = "省代号")
    private String provinceCode;

    @ApiModelProperty(value = "省名称")
    private String provinceName;

    @ApiModelProperty(value = "市代号")
    private String cityCode;

    @ApiModelProperty(value = "市名称")
    private String cityName;

    @ApiModelProperty(value = "区代号")
    private String areaCode;

    @ApiModelProperty(value = "区名称")
    private String areaName;

    @ApiModelProperty(value = "邮政编码")
    private String zip;

    @ApiModelProperty(value = "详细地址")
    private String address;

    @ApiModelProperty(value = "手机")
    private String phone;

    @ApiModelProperty(value = "固定电话")
    private String tel;

    @ApiModelProperty(value = "地址类型")
    private String tag;

    @ApiModelProperty(value = "是否默认，0-非默认，1-默认")
    private Integer isDefault;

    @ApiModelProperty(value = "创建人")
    private String createdUser;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createdTime;

    @ApiModelProperty(value = "修改执行人")
    private String modifiedUser;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime modifiedTime;


}
