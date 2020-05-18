package com.mcss.store.customer.service.impl;

import com.mcss.store.customer.entity.Product;
import com.mcss.store.customer.mapper.ProductMapper;
import com.mcss.store.customer.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.ibatis.reflection.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Autowired
    private ProductMapper productMapper;

    /**
     * 查询全部商品信息
     * @return
     */
    @Override
    public List<Product> findAll() {
        return list(null);
    }

    @Override
    public List<Product> getNewList() {
        return productMapper.findNewList();
    }
}
