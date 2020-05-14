package com.mcss.store.sys.controller;


import com.mcss.store.sys.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Arron
 * @since 2020-05-14
 */
@Api(tags = "用户模块的接口信息")
@RestController
@RequestMapping("/sys/user")
public class UserController {
    /* 方法注解 */
    @ApiOperation(value = "查询操作", notes = "用户查询操作")
    @GetMapping(value="/select")
    public User select(@ApiParam(value = "姓名" , required=true ) @RequestParam String name) {
        User u = new User();
        u.getNickName();
        u.getLanguage();
        u.getAvatarUrl();
        return u;
    }

    /* 方法注解 */
    @ApiOperation(value = "新增操作", notes = "用户新增操作")
    @PostMapping(value="/add")
    public User add(User u) {

        return u;
    }
}
