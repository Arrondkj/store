package com.mcss.store.customer.controller;


import com.fengwenyi.api_result.helper.ResultHelper;
import com.fengwenyi.api_result.model.ResultModel;
import com.mcss.store.customer.entity.ProductCategory;
import com.mcss.store.customer.service.IProductCategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Arron
 * @since 2020-05-18
 */
@Api(tags = "商品分类的接口信息")
@RestController
@RequestMapping("/customer/product-category")
public class ProductCategoryController {

    @Autowired
    private IProductCategoryService productCategoryService;

    @GetMapping("/listPage")
    public String listPage() {
        return "productCategory/list";
    }

//    @ApiOperation(value = "查询商品分类", notes = "查询商品分类操作")
//    @GetMapping("/getList")
//    public ResultModel<List<ProductCategory>> getList(ProductCategory productCategory) {
//        List<ProductCategory> data = productCategoryService.list();
//        return ResultHelper.success("success",data);
//    }

}
