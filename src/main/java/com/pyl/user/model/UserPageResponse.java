package com.pyl.user.model;

import java.util.List;


public class UserPageResponse {

    public UserPageResponse(){}
    private List<UserResponse> content;
    private int page;
    private int size;
    private int totalPages;

    public void setContent(List<UserResponse> content) {
        this.content = content;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public List<UserResponse> getContent() {
        return content;
    }

    public int getPage() {
        return page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
