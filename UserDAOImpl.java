package com.niit.shopping.dao;

public class UserDAOImpl implements UserDAO {

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

}
