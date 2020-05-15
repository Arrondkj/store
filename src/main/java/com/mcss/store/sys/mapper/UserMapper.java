package com.mcss.store.sys.mapper;

import com.mcss.store.sys.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Negative;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Arron
 * @since 2020-05-14
 */
@Component
public interface UserMapper extends BaseMapper<User> {

}
