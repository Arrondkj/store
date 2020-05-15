package com.mcss.store.customer.service.impl;

import com.mcss.store.customer.entity.Product;
import com.mcss.store.customer.mapper.ProductMapper;
import com.mcss.store.customer.service.IProductService;
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
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
