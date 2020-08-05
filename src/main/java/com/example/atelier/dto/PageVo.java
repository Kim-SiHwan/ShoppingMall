package com.example.atelier.dto;

import lombok.Getter;

@Getter
public class PageVo {

    private static final int default_size = 4;
    private static final int default_max_size = 10;

    private int page;
    private int psize;

    public PageVo() {
        this.page = 0;
        this.psize = default_size;
    }

    public void setPage(int page) {
        this.page = page < 0 ? 0 : page;
    }
    public void setSize(int size) {
        this.psize = size < default_size || size > default_max_size ? default_size : size;
    }

}
