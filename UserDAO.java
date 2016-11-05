package com.niit.shopping.dao;

import java.util.List;

import org.springframework.stereotype.Repository;


import com.niit.shopping.model.User;

@Repository
public interface UserDAO 
{
	public boolean isValidate(String name,String pass);
	
	
    public boolean save(User user);
	public boolean delete(User user);
	public User get(int id);
	public List<User> list();

}
