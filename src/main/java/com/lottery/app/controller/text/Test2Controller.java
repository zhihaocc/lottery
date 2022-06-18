package com.lottery.app.controller.text;

import com.lottery.app.service.test.Test2Service;
import com.lottery.app.pojo.dto.TreeDTO;
import com.lottery.app.util.page.PageUtils;
import com.lottery.app.util.response.R;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
public class Test2Controller {

    @Resource
    private Test2Service test2Service;

    @ApiOperation(value = "树形结构列表")
    @GetMapping("/list")
    public R<PageUtils<TreeDTO>> listUser() {

        PageUtils<TreeDTO> treeList = test2Service.getTreeList();
        return R.data(treeList);
    }
}
