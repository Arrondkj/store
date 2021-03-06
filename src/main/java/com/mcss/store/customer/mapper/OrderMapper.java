package com.mcss.store.customer.mapper;

import com.mcss.store.customer.entity.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Arron
 * @since 2020-05-14
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

}
