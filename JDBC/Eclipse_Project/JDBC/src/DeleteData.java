import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteData {
	public static void main(String[] args) {
		try {
			Connection conn = DBConnection.getConnection();
			
			String query = "DELETE FROM Employee WHERE EmployeeID = ?";
			
			PreparedStatement pstmt = conn.prepareStatement(query);
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the id of the employee to be deleted: ");
			pstmt.setInt(1, sc.nextInt());
			sc.close();
			
			int re = pstmt.executeUpdate();
			
			
			if(re > 0) {
				System.out.println("Data Deleted Successfully!");
			} else {
				System.out.println("Failed to Delete Data!");
			}			
			conn.close();
			RetrieveData.main(args);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
