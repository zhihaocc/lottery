package com.lottery.app.pojo.dto;

import lombok.Data;

import java.util.List;

@Data
public class TreeDTO {
    private String id;
    private String pid;
    private String name;
    private List<TreeDTO> children;
}
