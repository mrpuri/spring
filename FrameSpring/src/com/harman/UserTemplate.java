package com.harman;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class UserTemplate implements UserDAO{
	private DataSource dataSource;
	   private JdbcTemplate jdbcTemplateObject;
	   User user_info = null;
	
	@Override
	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub
		this.dataSource = dataSource;
		System.out.println("Data S: " + dataSource);
		jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	@Override
	public void create(String name, Integer age) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public User getUser(String email, String password) {
		String SQL = "select * from users where email = ? and password = ?";
		//hspuri26@gmail.com
		System.out.println("email: " + email + "\tpass: " + password);
		try {
	      user_info = jdbcTemplateObject.queryForObject(SQL, new Object[]{email,password}, new UserDataMapper());
		}
		catch(Exception ex) {
			ex.printStackTrace();

		}
	      return user_info;
	}
	@Override
	public List<User> listUser() {
		// TODO Auto-generated method stub
		return null;
	}
	   
	   
	 /*
	   public User getUser(String email, String password) {
	      String SQL = "select (name) from User where email = ? and password = ?";
	      User user_info = jdbcTemplateObject.queryForObject(SQL, 
	    	         new Object[]{email,password}, new UserDataMapper());
	    	      
	      return user_info;
	     
	     
	   }
	   public void create(String email, String password) {
		      String SQL = "insert into Student (name, age) values (?, ?)";
		      jdbcTemplateObject.update( SQL, name, age);
		      System.out.println("Created Record Name = " + name + " Age = " + age);
		      return;
		   }
	   public List<Student> listStudents() {
	      String SQL = "select * from Student";
	      List <Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
	      return students;
	   }
	   public void delete(Integer id) {
	      String SQL = "delete from Student where id = ?";
	      jdbcTemplateObject.update(SQL, id);
	      System.out.println("Deleted Record with ID = " + id );
	      return;
	   }
	   public void update(Integer id, Integer age){
	      String SQL = "update Student set age = ? where id = ?";
	      jdbcTemplateObject.update(SQL, age, id);
	      System.out.println("Updated Record with ID = " + id );
	      return;
	   }
	   */
}