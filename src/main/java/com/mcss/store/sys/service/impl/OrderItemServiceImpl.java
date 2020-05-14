package com.mcss.store.sys.service.impl;

import com.mcss.store.sys.entity.OrderItem;
import com.mcss.store.sys.mapper.OrderItemMapper;
import com.mcss.store.sys.service.IOrderItemService;
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
