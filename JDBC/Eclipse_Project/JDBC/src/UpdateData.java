import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateData {
	public static void main(String[] args) {
		try {
			Connection conn = DBConnection.getConnection();
			
			String query = "UPDATE Employee SET FirstName = ?, LastName = ?, Department = ?, Salary = ?, HireDate = ? WHERE EmployeeID = ?";
			
			//create statement
			PreparedStatement pstmt = conn.prepareStatement(query);
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter the id of the employee to be updated: ");
			pstmt.setInt(6, sc.nextInt());
			
			sc.nextLine();
			System.out.print("Enter FirstName: ");
			pstmt.setString(1, sc.nextLine());
			
			//sc.nextLine();	//to clear the buffer
			System.out.print("Enter LastName: ");
			pstmt.setString(2, sc.nextLine());
			
			
			System.out.print("Enter Department: ");
			pstmt.setString(3, sc.nextLine());
			
			System.out.print("Enter Salary: ");
			pstmt.setDouble(4, sc.nextDouble());
			
			sc.nextLine();
			System.out.print("Enter HireDate (format: yyyy-mm-dd): ");
			String date = sc.nextLine();
			pstmt.setDate(5, Date.valueOf(date));
			sc.close();
			
			
			int re = pstmt.executeUpdate();
			
			if(re > 0) {
				System.out.println("Data Updated Successfully!");
				RetrieveData.main(args);
			} else {
				System.out.println("Failed to Update Data!");
			}
			conn.close();			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


/*
Update Query:

UPDATE Employee
SET
    FirstName = 'NewFirstName',
    LastName = 'NewLastName',
    Department = 'NewDepartment',
    Salary = 50000.00, -- New salary value
    HireDate = '2023-10-30' -- New hire date value
WHERE EmployeeID = 1; -- You can specify the condition to identify the specific record you want to update

*/