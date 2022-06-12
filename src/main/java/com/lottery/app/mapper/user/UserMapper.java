package com.lottery.app.mapper.user;

import com.lottery.app.config.Test2;
import com.lottery.app.pojo.dto.TreeDTO;

import java.util.HashMap;
import java.util.List;

public interface UserMapper {
    HashMap<String,String> getUser();

    List<Test2> selectTreeList();

    List<TreeDTO> getTree();
}
