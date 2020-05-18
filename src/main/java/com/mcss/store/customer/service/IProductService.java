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
     * 查询新品推荐排行榜的前4个商品信息
     * @return
     */
    List<Product> getNewList();

}
