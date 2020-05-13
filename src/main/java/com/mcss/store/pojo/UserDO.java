package com.mcss.store.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Accessors(chain = true)
@TableName(value = "t_user")
public class UserDO {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id; // 主键
    @TableField("open_id")
    private String openId;// '用户的唯一标识'
    @TableField("nick_name")
    private String nickName; // 昵称
    @TableField("session_key")
    private String sessionKey;// '会话密钥'
    @TableField("nick_name")
    private String nickname;// '用户昵称'
    @TableField("avatar_url")
    private String avatarurl;// '用户链接'
    @TableField("gender")
    private Integer gender;// '性别   0 男  1  女'
    @TableField("country")
    private String country;// '所在国家'
    @TableField("province")
    private String province;// '省份'
    @TableField("city")
    private String city;// '城市'
    @TableField("language")
    private String language;// '语言'
    @TableField("mobile")
    private String mobile;// '手机类型'
    @TableField("tel_num")
    private String telNum;// '手机号码'
    @TableField("created_user")
    private String createdUser;// '创建人'
    @TableField("created_time")
    private Date createdTime;// '创建时间'
    @TableField("modified_user")
    private String modifiedUser;// '修改执行人'
    @TableField("modified_time")
    private Date modifiedTime;// '修改时间'
}
