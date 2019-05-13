package com.harman;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.harman.User;

public class UserDataMapper implements RowMapper<User> {
   public User mapRow(ResultSet rs, int rowNum) throws SQLException {
	  User userinfo = new User();
	      
	      userinfo.setName(rs.getString("name"));
	      userinfo.setEmail(rs.getString("email"));
	      userinfo.setPassword(rs.getString("password"));
	      return userinfo;

      
   }
}

