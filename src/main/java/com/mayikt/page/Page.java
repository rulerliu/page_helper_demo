package com.mayikt.page;

import java.util.List;

public class Page<E> {
    private Integer totalPage;
    private Integer pageSize;
    private Integer currentPage;
    private Integer currentPageCount;
    private List<E> data;

    public Page() {

    }

    public Page(Integer totalPage, Integer pageSize, Integer currentPage, Integer currentPageCount, List<E> data) {
        this.totalPage = totalPage;
        this.pageSize = pageSize;
        this.currentPage = currentPage;
        this.currentPageCount = currentPageCount;
        this.data = data;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getCurrentPageCount() {
        return currentPageCount;
    }

    public void setCurrentPageCount(Integer currentPageCount) {
        this.currentPageCount = currentPageCount;
    }

    public List<E> getData() {
        return data;
    }

    public void setData(List<E> data) {
        this.data = data;
    }
}