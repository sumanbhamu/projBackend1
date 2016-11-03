package com.niit.shopping.dao;

import java.util.List;

import com.niit.shopping.model.Category;
import com.niit.shopping.model.Product;

public interface CategoryDAO 
{
    public boolean savOrUpdate();
	
	public boolean delete(Category category);
	public Category get(int id);
	//collection of category list
	public List<Category> list();
	

}
