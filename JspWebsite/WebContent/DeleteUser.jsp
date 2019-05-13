<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
	String name, country, password;	
%>
<%  

int id=Integer.parseInt(request.getParameter("Id"));

 
	Connection con = null;
	
	try{  
		Class.forName("com.mysql.jdbc.Driver");
	  con = DriverManager.getConnection("jdbc:mysql://localhost/JspD","root","");
	  String q="select * from User where id=?";
	  PreparedStatement myst=con.prepareStatement(q);
	  myst.setInt(1,id);
	  ResultSet myresult=myst.executeQuery();
      if(myresult.next())
      {
    	 name= myresult.getString("name");
    	 password= myresult.getString("password");
    	 country= myresult.getString("country");
      }
      else
      {
    	  out.println("Error");
      }
      //out.println("<input type="text" name="name" value=" name "/>" )
%>
<table> 
<tr>
<td>
name</td>
<td>
<input type="password" name="password" value=<%= name%>/>
</td>
</tr>
<tr><td>Password:</td>
<td>  
<input type="password" name="password" value=<%= password%>/>
</td>
</tr>
<tr>
<td>  
<input type="text" name="country" value=<%=country%>/>
</td>
</tr>
</table>
<%
	PreparedStatement stmt=con.prepareStatement("delete from user where id = ?");  
	
	stmt.setInt(1, id);
	
	
	if(stmt.executeUpdate()!=0)
	{
		out.println("record deleted successfully");
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