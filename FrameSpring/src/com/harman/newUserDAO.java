package com.harman;

import java.util.List;

import javax.sql.DataSource;

public interface newUserDAO {
	public void setDataSource(DataSource ds);
	   
	   /** 
	      * This is the method to be used to create
	      * a record in the Student table.
	   */
	   public void create(String name, Integer age, Float number, String email, String password, String address);
	   
	   /** 
	      * This is the method to be used to list down
	      * a record from the Student table corresponding
	      * to a passed student id.
	   */
	   public newUser getUser(String email, String password);
	   
	   /** 
	      * This is the method to be used to list down
	      * all the records from the Student table.
	   */
	   public List<newUser> listnewUser();
	   
}
