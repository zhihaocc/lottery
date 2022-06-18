package com.lottery.app.util.page;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.List;

public class PageUtils<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(
            value = "总记录数",
            required = true,
            notes = "总记录数"
    )
    private long totalCount;
    @ApiModelProperty(
            value = "每页记录数",
            required = true,
            notes = "每页记录数"
    )
    private long pageSize;
    @ApiModelProperty(
            value = "总页数",
            required = true,
            notes = "总页数"
    )
    private long totalPage;
    @ApiModelProperty(
            value = "当前页数",
            required = true,
            notes = "当前页数"
    )
    private long currPage;
    @ApiModelProperty(
            value = "列表数据",
            notes = "列表数据"
    )
    private List<T> list;

    public PageUtils(List<T> list, long totalCount, long pageSize, long currPage) {
        this.list = list;
        this.totalCount = totalCount;
        this.pageSize = pageSize;
        this.currPage = currPage;
        this.totalPage = (long)((int)Math.ceil((double)totalCount / (double)pageSize));
    }

    public PageUtils(Page<T> page) {
        this.list = page.getRecords();
        this.totalCount = page.getTotal();
        this.pageSize = page.getSize();
        this.currPage = page.getCurrent();
        this.totalPage = page.getPages();
    }

    public long getTotalCount() {
        return this.totalCount;
    }

    public long getPageSize() {
        return this.pageSize;
    }

    public long getTotalPage() {
        return this.totalPage;
    }

    public long getCurrPage() {
        return this.currPage;
    }

    public List<T> getList() {
        return this.list;
    }

    public void setTotalCount(final long totalCount) {
        this.totalCount = totalCount;
    }

    public void setPageSize(final long pageSize) {
        this.pageSize = pageSize;
    }

    public void setTotalPage(final long totalPage) {
        this.totalPage = totalPage;
    }

    public void setCurrPage(final long currPage) {
        this.currPage = currPage;
    }

    public void setList(final List<T> list) {
        this.list = list;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof PageUtils)) {
            return false;
        } else {
            PageUtils<?> other = (PageUtils)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getTotalCount() != other.getTotalCount()) {
                return false;
            } else if (this.getPageSize() != other.getPageSize()) {
                return false;
            } else if (this.getTotalPage() != other.getTotalPage()) {
                return false;
            } else if (this.getCurrPage() != other.getCurrPage()) {
                return false;
            } else {
                Object this$list = this.getList();
                Object other$list = other.getList();
                if (this$list == null) {
                    if (other$list != null) {
                        return false;
                    }
                } else if (!this$list.equals(other$list)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PageUtils;
    }

    @Override
    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        long $totalCount = this.getTotalCount();
        result = result * 59 + (int)($totalCount >>> 32 ^ $totalCount);
        long $pageSize = this.getPageSize();
        result = result * 59 + (int)($pageSize >>> 32 ^ $pageSize);
        long $totalPage = this.getTotalPage();
        result = result * 59 + (int)($totalPage >>> 32 ^ $totalPage);
        long $currPage = this.getCurrPage();
        result = result * 59 + (int)($currPage >>> 32 ^ $currPage);
        Object $list = this.getList();
        result = result * 59 + ($list == null ? 43 : $list.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "PageUtils(totalCount=" + this.getTotalCount() + ", pageSize=" + this.getPageSize() + ", totalPage=" + this.getTotalPage() + ", currPage=" + this.getCurrPage() + ", list=" + this.getList() + ")";
    }
}

