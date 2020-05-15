package com.mcss.store.sys.service;

import com.mcss.store.sys.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.mcss.store.sys.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

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
