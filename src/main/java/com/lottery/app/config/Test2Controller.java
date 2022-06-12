package com.lottery.app.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class Test2Controller {

    @Autowired
    private Test2Service test2Service;

    @ApiOperation(value = "树形结构列表")
    @GetMapping("/list")
    public ResponseEntity listUser() {
        TreeNode node = new TreeNode();
        List<Test2> treeList = test2Service.getTreeList();
        if (treeList.size() > 0) {
            for (Test2 test : treeList) {
                // 初始化
                TreeNode tn = new TreeNode(test.getId(), test.getpid(),test.getId(), test.getName());
                node.add(tn);
            }
        }
        return new ResponseEntity("200", "success", node.getChildren());
    }
}
