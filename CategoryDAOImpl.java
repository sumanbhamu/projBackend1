package com.niit.shopping.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.shopping.model.Category;
import com.niit.shopping.model.Product;

public class CategoryDAOImpl implements CategoryDAO 
{

	@Autowired
	SessionFactory sessionFactory;

		public CategoryDAOImpl(SessionFactory sessionFactory)
	{
		super();
		this.sessionFactory = sessionFactory;

		// TODO Auto-generated constructor stub
	}

		public boolean savOrUpdate() {
			// TODO Auto-generated method stub
			return false;
		}

		public boolean delete(Category category) {
			// TODO Auto-generated method stub
			return false;
		}

		public Category get(int id) {
			// TODO Auto-generated method stub
			return null;
		}

		public List<Category> list() {
			// TODO Auto-generated method stub
			return null;
		}
	
	
	

}
