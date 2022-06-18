package com.lottery.app.mapper.user;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lottery.app.pojo.dto.TreeDTO;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface UserMapper {
    HashMap<String,String> getUser();

    List<TreeDTO> selectTreeList(@Param("page") Page<TreeDTO> page);

    List<TreeDTO> getTree();
}
