package com.niit.shopping.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shopping.model.User;

@Repository(value = "userDAO")
@EnableTransactionManagement
public class UserDAOImpl implements UserDAO {
	@Autowired
	SessionFactory sessionFactory;

	public boolean isValidate(String name, String pass) {
		{
			if (name.equals("sa") && pass.equals("sa")) {
				// b=true;
				return true;
			} else {
				return false;
			}

		}

	}

	public UserDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	public boolean delete(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional

	public boolean save(User user) {
		try {
			
			  Session s=sessionFactory.getCurrentSession(); 
			  Transaction t=s.beginTransaction();
			  s.saveOrUpdate(user); 
			  t.commit();

			 

			/*sessionFactory.getCurrentSession().saveOrUpdate(user);
			*/return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
