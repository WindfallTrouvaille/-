package movies.model.dao;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class DBConnection {
	
	private static Connection conn = null;
	
	private static String databaseName = "jdbc:mysql://localhost:3306/Movies?useSSL=false";
	private static String user = "root";
    private static String password = "123456";
	
	public static Connection openConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection(databaseName, user, password);
			System.out.println("Connected to database successfully");
		} catch ( Exception e ) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		}		  
		return conn; 
	}
	
	public static void closeConnection() {
		
		try {
			conn.close();
			System.out.println("Disconnected from database successfully");
		} catch (Exception e) {
			 System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		}
	}	     	
}

