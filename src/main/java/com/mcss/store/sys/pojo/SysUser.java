package com.mcss.store.sys.pojo;

import com.mcss.store.common.pojo.PageEntity;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;

/**
 * @Author Arron
 * @Date 2020/5/18 10:53
 * @Version 1.0
 * @Description: 后台管理员
 */
public class SysUser extends PageEntity {
    private Integer id; // 主键
    private String username; // 登录名
    private String password; // 密码
    private String name; // 姓名
    private Integer sex; // 性别
    private Integer age; // 年龄
    private String createdUser; // 创建人
    private LocalDateTime createdTime; // 创建时间
    private String modifiedUser; // 修改执行人
    private LocalDateTime modifiedTime; // 修改时间
}
