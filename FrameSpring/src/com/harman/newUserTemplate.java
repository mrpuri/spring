package com.harman;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import com.harman.newUser;
public class newUserTemplate implements newUserDAO{
	private DataSource dataSource;
	   private JdbcTemplate jdbcTemplateObject;
	   newUser nu = null;
	@Override
	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub
		this.dataSource= dataSource;
		jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	@Override
	public void create(String name, Integer age, Float number, String email, String password, String address) {
		String SQL = "insert into userinfo (name, age, email, password, address, number) values (?, ?,?,?,?,?)";
	      jdbcTemplateObject.update( SQL, name, age, email, password, address, number);
	      System.out.println("Created Record ");
	      return;
		
	}

	@Override
	public newUser getUser(String email, String password) {
		String SQL = "select * from userinfo where email = ? and password = ?";
	      nu = jdbcTemplateObject.queryForObject(SQL, new Object[]{email,password}, new newUserDataMapper());
	      return nu;
	}

	@Override
	public List<newUser> listnewUser() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
