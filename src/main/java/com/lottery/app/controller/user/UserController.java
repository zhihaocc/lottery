package com.lottery.app.controller.user;

import com.lottery.app.pojo.dto.TreeDTO;
import com.lottery.app.pojo.dto.UserDTO;
import com.lottery.app.service.user.UserService;
import com.lottery.app.util.response.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(value = "主入口", tags = "主入口")
@RequestMapping(value = "/lot")
public class UserController {
    @Resource
    UserService userService;

    @PostMapping(value = "/getUser")
    @ApiOperation(value = "获取用户信息", notes = "获取用户信息")
    @ResponseBody
    public R<List<UserDTO>> getUser(){

        return R.data(userService.getUser());
    }

    @RequestMapping(value = "/getTree")
    @ApiOperation(value = "树", notes = "树")
    @ResponseBody
    public List<TreeDTO> getTree(){

        return userService.getTree();
    }
}
