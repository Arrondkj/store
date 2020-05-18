package com.mcss.store.customer.controller;


import com.fengwenyi.api_result.model.ResultModel;
import com.mcss.store.customer.entity.Product;
import com.mcss.store.customer.service.IProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Arron
 * @since 2020-05-14
 */
@Api(tags = "商品模块的接口信息")
@RestController
@RequestMapping("/sys/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("/findNewList")
    @ApiOperation(value = "查询商品 新品推荐", notes = "用户添加操作")
    public ResultModel<List<Product>> findNewList() {
        List<Product> data = productService.getNewList();
        return new ResultModel("OK",data);
    }
}
