import java.sql.*;

public class JDBCMeta {
	public static void main(String[] args) {
		try {
			Connection conn = DBConnection.getConnection();
			
			DatabaseMetaData dbmd = conn.getMetaData();
			
//			System.out.println("Driver Name: " + dbmd.getDriverName());
//			System.out.println("Driver Version: " + dbmd.getDriverVersion());
//			System.out.println("UserName: " +dbmd.getUserName());
//			System.out.println("DataBase Product Name: " + dbmd.getDatabaseProductName());
//			System.out.println("DataBase Product Version: " + dbmd.getDatabaseProductVersion());
			

			String table[] = {"TABLE"};
			ResultSet rs = dbmd.getTables(null, null, null, table);
			
			while(rs.next()) {
				System.out.println(rs.getString(3));
			}
			
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
