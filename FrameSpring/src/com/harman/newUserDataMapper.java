package com.harman;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.harman.newUser;

public class newUserDataMapper implements RowMapper<newUser> {
   public newUser mapRow(ResultSet rs, int rowNum) throws SQLException {
	  newUser userinfo = new newUser();
	      
	      userinfo.setName(rs.getString("name"));
	      userinfo.setEmail(rs.getString("email"));
	      userinfo.setPassword(rs.getString("password"));
	      userinfo.setAddress(rs.getString("address"));
	      userinfo.setAge(rs.getInt("age"));
	      userinfo.setNumber(rs.getFloat("number"));
	      return userinfo;

      
   }
}