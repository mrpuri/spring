package com.harman;

import java.util.List;

import javax.sql.DataSource;

import com.harman.User;

public interface UserDAO {
	public void setDataSource(DataSource ds);
	   
	   /** 
	      * This is the method to be used to create
	      * a record in the Student table.
	   */
	   public void create(String name, Integer age);
	   
	   /** 
	      * This is the method to be used to list down
	      * a record from the Student table corresponding
	      * to a passed student id.
	   */
	   public User getUser(String email, String password);
	   
	   /** 
	      * This is the method to be used to list down
	      * all the records from the Student table.
	   */
	   public List<User> listUser();
	   
	   /** 
	      * This is the method to be used to delete
	      * a record from the Student table corresponding
	      * to a passed student id.
	   */

}
