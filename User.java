//its a pojo or do(domain object)--model
package com.niit.shopping.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

/* Entity refers to the class to be converted into table */
@Entity
/* Table specifies the table name */
@Table(name="user")
public class User
{
	 /* ID refers to the Primary key*/
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int user_id;
	
	@NotNull(message="Name should not be empty")
	private String username;
	
	@NotNull(message="Password should be 5 to 6 charherters")
	private String password;
	
	@Transient   /*not to store in D.B*/
	private String confirmpassword;
	
	
	@NotNull(message="Enter valid email")
	private String emailid;
	
	@NotNull(message="Enter valid Number")
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

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
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
