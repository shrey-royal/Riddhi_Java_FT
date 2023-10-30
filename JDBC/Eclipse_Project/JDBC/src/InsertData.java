import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertData {
	public static void main(String[] args) {
		try {
			Connection conn = DBConnection.getConnection();
			/*
			//create statement
			Statement stmt = conn.createStatement();
			
			String query = "INSERT INTO Employee (FirstName, LastName, Department, Salary, HireDate) VALUES ('Riddhi', 'Mistry', 'Software', 12000000, '2020-04-12')";
			
			int re = stmt.executeUpdate(query);
			
			if(re > 0) {
				System.out.println("Data Inserted Successfully!");
			} else {
				System.out.println("Failed to Insert Data!");
			}
			*/
			
			String query = "INSERT INTO Employee (FirstName, LastName, Department, Salary, HireDate) VALUES (?, ?, ?, ?, ?)";	//? is a placeholder
			
			//create statement
			PreparedStatement pstmt = conn.prepareStatement(query);
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter FirstName: ");
			pstmt.setString(1, sc.nextLine());
			
			//sc.nextLine();	//to clear the buffer
			System.out.print("Enter LastName: ");
			pstmt.setString(2, sc.nextLine());
			
			
			System.out.print("Enter Department: ");
			pstmt.setString(3, sc.nextLine());
			
			System.out.print("Enter FirstSalary: ");
			pstmt.setDouble(4, sc.nextDouble());
			
			sc.nextLine();
			System.out.print("Enter HireDate (format: yyyy-mm-dd): ");
			String date = sc.nextLine();
			pstmt.setDate(5, Date.valueOf(date));
			sc.close();
			
			
			int re = pstmt.executeUpdate();
			
			if(re > 0) {
				System.out.println("Data Inserted Successfully!");
			} else {
				System.out.println("Failed to Insert Data!");
			}
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/*
Create Table:

-- Create Employee table
CREATE TABLE Employee (
    EmployeeID INT AUTO_INCREMENT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    Department VARCHAR(50),
    Salary DECIMAL(10, 2),
    HireDate DATE
);

syntax:

CREATE TABLE tblName (
	column_name column_type constraints(if any),
	column_name column_type,
	.
	.
	column_name column_type
);




*/