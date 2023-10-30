import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveData {
	public static void main(String[] args) {
		try {
			Connection conn = DBConnection.getConnection();
			
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM Employee");
			
			System.out.println("EmployeeID\tFirstName\tLastName\tDepartment\tSalary\tHireDate");
			while(rs.next()) {
				System.out.println(rs.getInt(1) + "\t\t" + rs.getString("FirstName") + "\t\t" + rs.getString("LastName") + "\t\t" + rs.getString(4) + "\t\t\t" + rs.getDouble("Salary") + "\t\t" + rs.getDate("HireDate"));
			}
			
			conn.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
