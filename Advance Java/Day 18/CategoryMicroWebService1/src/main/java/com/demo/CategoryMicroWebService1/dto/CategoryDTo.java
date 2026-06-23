package com.demo.CategoryMicroWebService1.dto;

import java.util.List;

import com.demo.CategoryMicroWebService1.beans.Category;
import com.demo.CategoryMicroWebService1.beans.Product;

public class CategoryDTo {
	private Category category;
	private List<Product> plist;
	public CategoryDTo() {
		super();
	}
	public CategoryDTo(Category category, List<Product> plist) {
		super();
		this.category = category;
		this.plist = plist;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public List<Product> getPlist() {
		return plist;
	}
	public void setPlist(List<Product> plist) {
		this.plist = plist;
	}
	@Override
	public String toString() {
		return "CategoryDTo [category=" + category + ", plist=" + plist + "]";
	}

}
