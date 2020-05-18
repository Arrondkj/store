package com.mcss.store;

import com.mcss.store.customer.entity.Product;
import com.mcss.store.customer.entity.ProductCategory;
import com.mcss.store.customer.mapper.ProductCategoryMapper;
import com.mcss.store.customer.mapper.ProductMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StoreApplicationTests {

    @Autowired
    ProductMapper productMapper;

    @Autowired
    ProductCategoryMapper productCategoryMapper;

    @Test
    void contextLoads() {
        List<Product> lists = productMapper.findNewList();
        lists.forEach(list -> System.err.println(list.getCreatedTime()));
    }

    @Test
    void add() {
        List<ProductCategory> lists = productCategoryMapper.getList(new ProductCategory());
        lists.forEach(list -> System.err.println(list));
    }

}
