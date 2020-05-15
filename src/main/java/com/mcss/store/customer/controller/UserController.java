package com.mcss.store.customer.controller;


import com.fengwenyi.api_result.helper.ResultHelper;
import com.fengwenyi.api_result.model.ResultModel;
import com.mcss.store.customer.entity.User;
import com.mcss.store.customer.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
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
@Api(tags = "用户模块的接口信息")
@RestController
@RequestMapping("/sys/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @ApiOperation(value = "修改用户", notes = "用户修改操作")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(
                            name = "nickName",
                            value = "用户名",
                            dataType = "String",
                            required = true
                    ),
                    @ApiImplicitParam(
                            name = "password",
                            value = "用户密码",
                            dataType = "String",
                            required = true)
            }
    )
    @PutMapping("/updateUser")
    public String updateUser(String nickName, String password) {
        return nickName + "," + password;
    }

    @PostMapping("/addUser")
    @ApiOperation(value = "添加用户", notes = "用户添加操作")
    public User addUser(@RequestBody User user) {
        return user;
    }

    @ApiOperation(value = "查询所有用户", notes = "用户查询操作")
    @GetMapping("/getUser")
    public ResultModel getAllUser() {
        List<User> users = userService.queryUserAll();
        return ResultHelper.success("Success", users);
    }

    @ApiOperation(value = "删除用户", notes = "用户删除操作")
    @DeleteMapping("/deleteUser")
    public String deleteUser() {
        return "删除";
    }

}
