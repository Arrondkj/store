package com.mcss.store.customer.mapper;

import com.mcss.store.customer.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Arron
 * @since 2020-05-14
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

    /**
     * 查询所有用户数据
     * @return
     */
    List<User> findAll();
}
