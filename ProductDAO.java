package com.niit.shopping.dao;

import java.util.List;

import com.niit.shopping.model.Product;

public interface ProductDAO 
{
	public boolean savOrUpdate();
	
	public boolean delete(Product product);
	public Product get(int id);
	//collection of products list
	public List<Product> list();
	
	
}
