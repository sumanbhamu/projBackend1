package com.niit.shopping.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDAOImpl implements UserDAO {
@Autowired
SessionFactory sessionFactory;
	public boolean isValidate(String name, String pass)
	{
		{
			if(name.equals("sa")&&pass.equals("sa"))
			{
				//b=true;
				return true;
			}
			else
			{
				 return false;
			}
		
		}

	}
	public UserDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}
	

}
