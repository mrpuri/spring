package jdbc;
import java.sql.*;
public class connector {
	public static void main(String args[])
	{
		  
		Connection con = null;
		try{  
			Class.forName("com.mysql.jdbc.Driver");
		  con =DriverManager.getConnection("jdbc:mysql://localhost/student","root","");

		PreparedStatement stmt=con.prepareStatement("insert into info values(?,?,?,?)");  
		stmt.setString(1,"rahul");  
		stmt.setInt(2,101); 
		stmt.setInt(3, 80);
		stmt.setString(4, "house no. 51 new jawahar road");
		if(stmt.executeUpdate()!=0)
		{
			System.out.println("Record updated successfully");
		}
		else
		{
			System.out.println("unable to update record");
		}
		con.close();
	}
	catch(Exception e)
	{
		//System.out.println(e.getMessage());
		e.printStackTrace();
	}
	
	try {
		String q="select * from info";
		PreparedStatement prepare=con.prepareStatement(q);  
		ResultSet rs=prepare.executeQuery();  
		System.out.println(rs.getInt(1));
		
	}catch(Exception e)
	{
		System.out.println("Cannot get record from database");
	}
}}

