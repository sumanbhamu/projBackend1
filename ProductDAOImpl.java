package com.niit.shopping.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.shopping.model.Product;


public class ProductDAOImpl implements ProductDAO {

	
	@Autowired
	SessionFactory sessionFactory;

	public boolean savOrUpdate() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> list() {
		// TODO Auto-generated method stub
		return null;
	}

	public ProductDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	
	
	
}
