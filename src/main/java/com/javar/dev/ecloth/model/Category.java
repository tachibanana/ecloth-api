package com.javar.dev.ecloth.model;

import java.util.List;

public class Category {

	private int categoryId;
	private String categoryName;
	private List<SubCategory> listOfSubCategory;
	
	public Category(){
		
	}
	
	public Category(int categoryId, String categoryName) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}

	public Category(int categoryId, String categoryName, List<SubCategory> listOfSubCategory) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.listOfSubCategory = listOfSubCategory;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<SubCategory> getListOfSubCategory() {
		return listOfSubCategory;
	}

	public void setListOfSubCategory(List<SubCategory> listOfSubCategory) {
		this.listOfSubCategory = listOfSubCategory;
	}
}
