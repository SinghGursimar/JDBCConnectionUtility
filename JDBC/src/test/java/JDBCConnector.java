

public class JDBCConnector
{
	
	public static void main(String[] args) 
	{
		DBManager.connect();
		DBManager.dbQuerry("select Name, CountryCode from city where Countrycode = 'AUS';");
			  
	}
}

