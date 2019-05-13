<!DOCTYPE html>
<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Record Info</title>
</head>

<%   

String email=request.getParameter("email");
String password=request.getParameter("password");

out.print("Welcome " + name);  
	Connection con = null;
	
	try{  
		Class.forName("com.mysql.jdbc.Driver");
	  con = DriverManager.getConnection("jdbc:mysql://localhost/JspD","root","");

	PreparedStatement stmt=con.prepareStatement("insert into User values(?,?,?,?)");  
	stmt.setString(1,name);  
	stmt.setString(2, password);
	stmt.setString(3, country);
	stmt.setInt(4,id);
	
	
	if(stmt.executeUpdate()!=0)
	{
		out.println("<br> Data Saved");
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