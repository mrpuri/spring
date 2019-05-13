<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update info</title>
</head>
<body>

<%  

int id=Integer.parseInt(request.getParameter("Id"));
String name=request.getParameter("name");
String password=request.getParameter("password");
String country=request.getParameter("country");
 
	Connection con = null;
	
	try{  
		Class.forName("com.mysql.jdbc.Driver");
	  con = DriverManager.getConnection("jdbc:mysql://localhost/JspD","root","");

	PreparedStatement stmt=con.prepareStatement("update user set name=?,password=?,country=? where id = ?");  
	stmt.setString(1, name);  
	stmt.setString(2, password);
	stmt.setString(3, country);
	stmt.setInt(4, id);
	
	
	if(stmt.executeUpdate()!=0)
	{
		out.println("data saved");
	}
	else
	{
		out.println("problem occured");
	}
	con.close();
}catch(Exception a)
{
	out.println(a.getMessage());
	a.printStackTrace();
}
%>
</body>
</html>