package com.mcss.store.customer.service;

import com.mcss.store.customer.entity.Product;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author Arron
 * @since 2020-05-14
 */
public interface IProductService extends IService<Product> {
    /**
     * @return 全部商品
     */
    List<Product> findAll();

    /**
     * 根据商品标题进行模糊查询
     * @param product
     * @return
     */
    List<Product> isProductExist(Product product);

}
