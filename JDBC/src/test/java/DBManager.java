import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBManager {
	private static Connection con;
	public static void connect()
	{
		try {
			//Step 1 initialize the driver class com.mysql.jdbc.Driver
			//Class.forName("com.mysql.jdbc.Driver"); this method is depricated
			Class.forName(DBConfig.mySQLdriver);
			// use the Connection interface and pass the drivermananger object to the interface reference
			 con=DriverManager.getConnection(DBConfig.mySQLurl,DBConfig.username,DBConfig.pasword);
			 if(!con.isClosed())
			 {
				 System.out.println("Connected to the SQL server");
			 }
			}
			catch (Exception e)
			{
				 System.out.println("Connection to the SQL server failed ");
			}
		
	}
	public static void dbQuerry(String querry)
	{
		try
		{
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery(querry);  
			while(rs.next())
			{
		System.out.println(rs.getString(1)+"  "+rs.getString(2));  
			}
		con.close();  
		}
			catch(Exception e)
			{ 
			System.out.println(e);
			}  
	}  
		
}
	
	


