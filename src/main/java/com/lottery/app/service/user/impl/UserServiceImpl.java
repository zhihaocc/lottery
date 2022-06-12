package com.lottery.app.service.user.impl;

import com.lottery.app.mapper.user.UserMapper;
import com.lottery.app.pojo.dto.TreeDTO;
import com.lottery.app.service.user.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public HashMap<String, String> getUser() {
        return userMapper.getUser();
    }

    @Override
    public List<TreeDTO> getTree() {
        return userMapper.getTree();
    }
}
