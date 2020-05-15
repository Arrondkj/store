package com.mcss.store.customer.service;

import com.mcss.store.customer.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Arron
 * @since 2020-05-14
 */
public interface IUserService extends IService<User> {

    /**
     * 查询所有数据
     * @return List<Student>
     */
    List<User> queryUserAll();
}
