package com.lottery.app.config;

import java.util.ArrayList;

public class TreeNode {
    private String uuid;
    private String parentUuid;
    private String tagUuid;
    private String poiName;
    private ArrayList<TreeNode> children = new ArrayList<TreeNode>();
    public TreeNode() {}
    /**
     * 递归添加节点
     */
    public void add(TreeNode node) {
        if (node.parentUuid == null || "".equals(node.parentUuid)) {
            // 父节点
            this.children.add(node);
        } else if (node.parentUuid.equals(this.uuid)) {
            // 子节点
            this.children.add(node);
        } else {
            for (TreeNode tmp_node : children) {
                tmp_node.add(node);
            }
        }
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getParentUuid() {
        return parentUuid;
    }

    public void setParentUuid(String parentUuid) {
        this.parentUuid = parentUuid;
    }

    public String getTagUuid() {
        return tagUuid;
    }

    public void setTagUuid(String tagUuid) {
        this.tagUuid = tagUuid;
    }

    public String getPoiName() {
        return poiName;
    }

    public void setPoiName(String poiName) {
        this.poiName = poiName;
    }

    public ArrayList<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<TreeNode> children) {
        this.children = children;
    }

    public TreeNode(String uuid, String parentUuid, String tagUuid, String poiName) {
        this.uuid = uuid;
        this.parentUuid = parentUuid;
        this.tagUuid = tagUuid;
        this.poiName = poiName;
    }
}
