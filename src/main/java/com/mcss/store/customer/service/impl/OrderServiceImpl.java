package com.mcss.store.customer.service.impl;

import com.mcss.store.customer.entity.Order;
import com.mcss.store.customer.mapper.OrderMapper;
import com.mcss.store.customer.service.IOrderService;
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
