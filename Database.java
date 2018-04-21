import java.sql.*;
import java.util.*;

public class Database{//Base class that sets up the connection to the database
	//Set up connection to database, set any constants needed for using the database
	//Note - This database class is not meant to be initialised but creates the connection with the database that is needed to read and write tables
	String databaseName, databaseUsername, databasePassword;
	public Database(String inputDatabaseName, String inputDatabaseUsername, String inputDatabasePassword){
		databaseName = inputDatabaseName;
		databaseUsername = inputDatabaseUsername;
		databasePassword = inputDatabasePassword;
	}
	
	private ResultSet executeQuery(String query){
		try(
			Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/" + databaseName + "?useSSL=false"
				/*String containing where the database can be accessed*/,
				databaseUsername
				/*String containing username to access the database*/,
				databasePassword
				/*String containing password of the user to access the database*/);
			Statement statement = connection.createStatement();
			)
			{
				ResultSet resultSet = statement.executeQuery(query);
				return(resultSet);//This will change from statement to statement so handleQuery
				//will change from class to class
			}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
	//Possibly create a re connect function to re start the connection to the database if needed
}