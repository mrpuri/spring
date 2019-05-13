<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2">
<tr>
<td>ID</td>
<td>NAME</td>
<td>SKILL</td>
</tr>
<%

Connection con = null;
	
	try{  
		Class.forName("com.mysql.jdbc.Driver");
	  con = DriverManager.getConnection("jdbc:mysql://localhost/JspD","root","");
	  String q="select * from User";
	  PreparedStatement myst=con.prepareStatement(q);
	  
	  ResultSet rs=myst.executeQuery();
      while(rs.next())
      {
    	  %>
    	   <tr><td><%=rs.getString("name") %></td>
    	    <td><%=rs.getString("country") %></td>
    	    <td><%=rs.getInt("id") %></td>
    	   </tr>
    	        <%
    	}
    	%>
    	    </table>
    	    <%
    	    rs.close();
    	    myst.close();
    	    con.close();
    	    }
    	catch(Exception e)
    	{
    	    e.printStackTrace();
    	    }
    	%>

</body>
</html>