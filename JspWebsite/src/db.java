
import java.sql.*;
public class db {
	public void data() {
		
	
	Connection con = null;
	
	try{  
		Class.forName("com.mysql.jdbc.Driver");
	  con = DriverManager.getConnection("jdbc:mysql://localhost/JspD","root","");

	PreparedStatement stmt=con.prepareStatement("insert into User values(?,?,?)");  
	//stmt.setString(1,);  
	//stmt.setString(2, 102);
	//stmt.setString(3, 90);
	
	
	if(stmt.executeUpdate()!=0)
	{
		
	}
	else
	{
		
	}
	con.close();
}
catch(Exception a)
{
	//System.out.println(e.getMessage());
	a.printStackTrace();
}
}
}

