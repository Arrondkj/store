package com.mcss.store.common.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author Arron
 * @Date 2020/5/18 10:50
 * @Version 1.0
 * @Description: 分页实体类
 */
@Data
public class PageEntity implements Serializable {
    private Integer page;
    private Integer limit;
}
