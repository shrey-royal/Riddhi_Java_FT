import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	public static Connection getConnection() {
		Connection conn = null;
		try {
			//Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Create Connection
			final String URL = "jdbc:mysql://localhost:3306/riddhi_jdbc";
			final String USERNAME = "root";
			final String PASSWORD = "root";
			
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			if(conn != null) {
				System.out.println("DB Connected Successfully!");
			} else {
				System.out.println("Failed to Conenct with the database!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	
	/*
	public static void main(String[] args) {
		try {
			//Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Create Connection
			final String URL = "jdbc:mysql://localhost:3306/riddhi_jdbc";
			final String USERNAME = "root";
			final String PASSWORD = "root";
			
			Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			if(conn != null) {
				System.out.println("DB Connected Successfully!");
			} else {
				System.out.println("Failed to Conenct with the database!");
			}
			
			conn.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/
}
/*
Steps to communicate with the database:

1. Load the driver
2. Create Connection
3. Create Statement(SQL Query)
4. Execute Query
5. Close Connection


*/