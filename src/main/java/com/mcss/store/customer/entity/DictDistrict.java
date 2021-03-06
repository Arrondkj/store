package com.mcss.store.customer.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("t_dict_district")
@ApiModel(value="DictDistrict对象", description="")
public class DictDistrict implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "行政id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer oid;

    @ApiModelProperty(value = "父级行政代号")
    private String parent;

    @ApiModelProperty(value = "行政代号")
    private String code;

    @ApiModelProperty(value = "行政区名称")
    private String name;


}
