package com.example.manguonmo_be.service.input;

public class PageInput<T> {

    private Integer pageNumber;

    private Integer pageSize;

    private T filter;

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setFilter(T filter) {
        this.filter = filter;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public T getFilter() {
        return filter;
    }
}
