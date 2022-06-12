package com.lottery.app.controller.user;

import com.lottery.app.pojo.dto.TreeDTO;
import com.lottery.app.service.user.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@RestController
@Api(value = "app接口类", tags = "app接口类")
@RequestMapping(value = "/lot")
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping(value = "/getUser")
    @ApiOperation(value = "统一访问接口", notes = "统一访问接口")
    @ResponseBody
    public HashMap<String,String> getUser(){

        return userService.getUser();
    }

    @RequestMapping(value = "/getTree")
    @ApiOperation(value = "树", notes = "树")
    @ResponseBody
    public List<TreeDTO> getTree(){

        return userService.getTree();
    }
}
