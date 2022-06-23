package com.lottery.app.pojo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "用户信息", description = "用户信息")
public class UserDTO {
    @ApiModelProperty(value = "账户名")
    private String userName;

    @ApiModelProperty(value = "账户密码")
    private String password;

    @ApiModelProperty(value = "昵称")
    private String nickname;

}
