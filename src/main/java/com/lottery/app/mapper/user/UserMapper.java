package com.lottery.app.mapper.user;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lottery.app.pojo.dto.TreeDTO;
import com.lottery.app.pojo.dto.UserDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    List<UserDTO> getUser();

    List<TreeDTO> selectTreeList(@Param("page") Page<TreeDTO> page);

    List<TreeDTO> getTree();
}
