package com.lottery.app.service.user;

import com.lottery.app.pojo.dto.TreeDTO;
import com.lottery.app.pojo.dto.UserDTO;

import java.util.List;

public interface UserService {

    List<UserDTO> getUser();

    List<TreeDTO> getTree();
}
