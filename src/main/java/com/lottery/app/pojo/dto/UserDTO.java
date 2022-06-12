package com.lottery.app.pojo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "用户查询", description = "用户查询")
public class UserDTO {

    @ApiModelProperty(value = "用户编号")
    private String userNum;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "用户名")
    private String userName;

}
