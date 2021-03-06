package com.mcss.store.customer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mcss.store.customer.entity.User;
import com.mcss.store.customer.mapper.UserMapper;
import com.mcss.store.customer.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

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


    @Override
    public List<User> queryUserAll() {
        return list(null);
    }
}
