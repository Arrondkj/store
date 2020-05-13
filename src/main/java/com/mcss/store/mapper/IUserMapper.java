package com.mcss.store.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mcss.store.pojo.UserDO;
import org.springframework.stereotype.Component;

@Component
public interface IUserMapper extends BaseMapper<UserDO> {
}
