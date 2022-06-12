package com.lottery.app.config;

import com.lottery.app.mapper.user.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Test2Service {

    @Resource
    private UserMapper mapper;

    public List<Test2> getTreeList() {
        return mapper.selectTreeList();
    }
}
