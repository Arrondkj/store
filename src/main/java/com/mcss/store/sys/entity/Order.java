package com.mcss.store.sys.entity;

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
@ApiModel(value="Order对象", description="")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "订单id")
    @TableId(value = "oid", type = IdType.AUTO)
    private Integer oid;

    @ApiModelProperty(value = "用户id")
    private Integer uid;

    @ApiModelProperty(value = "收货人姓名")
    private String recvName;

    @ApiModelProperty(value = "收货人电话")
    private String recvPhone;

    @ApiModelProperty(value = "收货时间")
    private LocalDateTime recvTime;

    @ApiModelProperty(value = "收货地址所在省")
    private String recvProvince;

    @ApiModelProperty(value = "收货地址所在市")
    private String recvCity;

    @ApiModelProperty(value = "收货地址所在区")
    private String recvArea;

    @ApiModelProperty(value = "收货详细地址")
    private String recvAddress;

    @ApiModelProperty(value = "总价")
    private Long totalPrice;

    @ApiModelProperty(value = "状态：0-未支付，1-已支付，2-已取消，3-已关闭，4-已完成")
    private Integer status;

    @ApiModelProperty(value = "下单时间")
    private LocalDateTime orderTime;

    @ApiModelProperty(value = "支付时间")
    private LocalDateTime payTime;

    @ApiModelProperty(value = "退货时间")
    private LocalDateTime returnTime;

    @ApiModelProperty(value = "创建人")
    private String createdUser;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createdTime;

    @ApiModelProperty(value = "修改执行人")
    private String modifiedUser;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime modifiedTime;


}
