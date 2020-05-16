package com.mcss.store.customer.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fengwenyi.api_result.helper.ResultHelper;
import com.fengwenyi.api_result.model.ResultModel;
import com.mcss.store.customer.entity.Product;
import com.mcss.store.customer.mapper.ProductMapper;
import com.mcss.store.customer.service.IProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/findAll")
    @ApiOperation(value = "查询全部商品信息", notes = "查询全部商品信息操作")
    public ResultModel queryProductAll() {
        List<Product> list = productService.findAll();
        return ResultHelper.success("Success", list);
    }

//    @GetMapping("/findAll")
//    @ApiOperation(value = "查询全部商品信息", notes = "查询全部商品信息操作")
//    public ResultModel isProductExist(@RequestBody Product product) {
//        //todo
//        return null;
//    }

    /**
     * todo
     * @param page
     * @return
     */
//    public ResultModel<Page<Product>> page(Page<Product> page) {
//        productService.page(page,new LambdaQueryWrapper<Product>().orderByAsc(Product::getSort).orderByDesc(Product::getCreateTime));
//        return new Message().ok("success").addData(page);

//    }
}
