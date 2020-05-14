package com.mcss.store.sys.service.impl;

import com.mcss.store.sys.entity.Order;
import com.mcss.store.sys.mapper.OrderMapper;
import com.mcss.store.sys.service.IOrderService;
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
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
