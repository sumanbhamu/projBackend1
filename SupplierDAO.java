package com.niit.shopping.dao;

import java.util.List;

import com.niit.shopping.model.Supplier;

public interface SupplierDAO {
	
public boolean savOrUpdate();
	
	public boolean delete(Supplier supplier);
	public Supplier get(int id);
	//collection of supplier list
	public List<Supplier> list();
	

}
