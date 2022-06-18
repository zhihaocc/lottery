package com.lottery.app.service.test;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lottery.app.mapper.user.UserMapper;
import com.lottery.app.pojo.dto.TreeDTO;
import com.lottery.app.util.PageUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Test2Service {

    @Resource
    private UserMapper mapper;

    public PageUtils<TreeDTO> getTreeList() {
        Page<TreeDTO> page = new Page<>(1, 2);
        List<TreeDTO> list = mapper.selectTreeList(page);
        page.setRecords(list);
        return new PageUtils<>(page);
    }
}
