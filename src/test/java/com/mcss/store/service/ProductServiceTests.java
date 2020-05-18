package com.mcss.store.service;

import com.mcss.store.customer.entity.Product;
import com.mcss.store.customer.service.IProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author Arron
 * @Date 2020/5/18 10:04
 * @Version 1.0
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceTests {
    @Autowired
    IProductService productServicer;

    @Test
    public void getNewList() {
        List<Product> lists = productServicer.getNewList();
        lists.forEach(list -> System.err.println(list));
    }
}
