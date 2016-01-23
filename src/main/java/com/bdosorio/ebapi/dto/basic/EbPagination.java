package com.bdosorio.ebapi.dto.basic;

public class EbPagination {
    private Integer page_number; // The current page number (starts at 1)
    private Integer page_size; // The number of objects on each page (roughly)
    private Integer object_count; // The total number of objects across all pages (optional)
    private Integer page_count; // The total number of pages (starting at 1) (optional)

    public Integer getPage_number() {
        return page_number;
    }

    public void setPage_number(Integer page_number) {
        this.page_number = page_number;
    }

    public Integer getPage_size() {
        return page_size;
    }

    public void setPage_size(Integer page_size) {
        this.page_size = page_size;
    }

    public Integer getObject_count() {
        return object_count;
    }

    public void setObject_count(Integer object_count) {
        this.object_count = object_count;
    }

    public Integer getPage_count() {
        return page_count;
    }

    public void setPage_count(Integer page_count) {
        this.page_count = page_count;
    }
}
