//its a pojo or do(domain object)--model
package com.niit.shopping.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/* Entity refers to the class to be converted into table */
@Entity
/* Table specifies the table name */
@Table(name="user")
public class User
{
	/* ID refers to the Primary key*/
	@Id
	private int user_id;
	private String username;
	private String password;
	private String emailid;
	private String phno;
	//enabled refers if user is enabled or not
	private String enabled;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		System.out.println("User Class in backend Model");
		
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getEnabled() {
		return enabled;
	}
	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
	

}
