package com.lottery.app.service.user;

import com.lottery.app.pojo.dto.TreeDTO;

import java.util.HashMap;
import java.util.List;

public interface UserService {

    HashMap<String,String> getUser();

    List<TreeDTO> getTree();
}
