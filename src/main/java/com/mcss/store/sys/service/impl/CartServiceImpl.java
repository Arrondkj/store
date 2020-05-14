package com.mcss.store.sys.service.impl;

import com.mcss.store.sys.entity.Cart;
import com.mcss.store.sys.mapper.CartMapper;
import com.mcss.store.sys.service.ICartService;
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
public class CartServiceImpl extends ServiceImpl<CartMapper, Cart> implements ICartService {

}
