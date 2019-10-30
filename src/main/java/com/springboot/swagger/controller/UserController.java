package com.springboot.swagger.controller;

import com.springboot.swagger.entity.RespBean;
import com.springboot.swagger.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import sun.nio.cs.US_ASCII;

@RestController
@Api(tags = "用户管理相关接口")
@RequestMapping("/user")
public class UserController {
    @PostMapping("/add")
    @ApiOperation(value="添加用户的接口",notes="添加用户操作")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户名", defaultValue = "李四"),
            @ApiImplicitParam(name = "address", value = "用户地址", defaultValue = "深圳", required = true)
    }
    )
    public RespBean<User> hello(String username, @RequestParam(required = true) String address){
        RespBean<User> respBean = new RespBean<User>();
    respBean.setCode(1);
    respBean.setMsg("success");
    User user = new User();
        user.setId(1);
        user.setUsername("1232");
        user.setAddress("OOO");
        respBean.setData(user);
        return respBean;
    }


    @GetMapping("/getUserById")
    @ApiOperation(value = "根据id查询用户的接口",notes="根据id查询用户信息")
    @ApiImplicitParam(name = "id", value = "用户id", defaultValue = "99", required = true)
    public User getUserById() {
        User user = new User();
        user.setId(1);
        user.setUsername("1232");
        user.setAddress("OOO");
        return user;
    }


}
