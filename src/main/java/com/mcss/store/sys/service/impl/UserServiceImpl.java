package com.mcss.store.sys.service.impl;

import com.mcss.store.sys.entity.User;
import com.mcss.store.sys.mapper.UserMapper;
import com.mcss.store.sys.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Arron
 * @since 2020-05-14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
