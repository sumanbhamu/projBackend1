package com.niit.shopping.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.shopping.model.Supplier;

public class SupplierDAOImpl implements SupplierDAO {

	@Autowired
	SessionFactory sessionFactory;

	public SupplierDAOImpl(SessionFactory sessionFactory)
	{
		super();
		this.sessionFactory = sessionFactory;

		// TODO Auto-generated constructor stub
	}

	
	public boolean savOrUpdate() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(Supplier supplier) {
		// TODO Auto-generated method stub
		return false;
	}

	public Supplier get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Supplier> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
