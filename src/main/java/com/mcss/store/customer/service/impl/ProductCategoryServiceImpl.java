package com.mcss.store.customer.service.impl;

import com.mcss.store.customer.entity.ProductCategory;
import com.mcss.store.customer.mapper.ProductCategoryMapper;
import com.mcss.store.customer.service.IProductCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Arron
 * @since 2020-05-18
 */
@Service
public class ProductCategoryServiceImpl extends ServiceImpl<ProductCategoryMapper, ProductCategory> implements IProductCategoryService {

}
