package com.mcss.store.customer.service.impl;

import com.mcss.store.customer.entity.OrderItem;
import com.mcss.store.customer.mapper.OrderItemMapper;
import com.mcss.store.customer.service.IOrderItemService;
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
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements IOrderItemService {

}
