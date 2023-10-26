package com.musicshop.model;

public class Category {
    private int categoryID;
    private Integer parentCategoryID;
    private String categoryName;

    public Category(int categoryID, Integer parentCategoryID, String categoryName) {
        this.categoryID = categoryID;
        this.parentCategoryID = parentCategoryID;
        this.categoryName = categoryName;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public Integer getParentCategoryID() {
        return parentCategoryID;
    }

    public void setParentCategoryID(Integer parentCategoryID) {
        this.parentCategoryID = parentCategoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
