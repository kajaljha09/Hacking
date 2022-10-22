import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class JDBC_Connection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner in=new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/wileyc309";
		String userName="root";
		String password="Abhishek@123";
		System.out.println("1-Loading and Registering Driver......");
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		System.out.println("Driver Registered!!");
		System.out.println("2-Establishing Connection....");
		Connection con=DriverManager.getConnection(url, userName, password);
		System.out.println("Connection Established!!!");
		
		System.out.println("3-Create Statement:");
		//String query=in.nextLine();//Select Employee_id,First_name,Last_name from Employee;
		Statement st=con.createStatement();
		System.out.println("Statement created!!");
		System.out.println("ResultSet Generated!!");
		ResultSet rs=st.executeQuery("Select Employee_id,First_name,Last_name from Employee order by Employee_id;");
		System.out.println("EmployeeID  | First Name | LastName");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3));
		}
		
		String sqlInsert="insert into employee(Employee_id,First_name,Last_name)values(9,'John','Doe')";
		
		int rowsAffected = st.executeUpdate(sqlInsert); //Numbers of Rows Affacted
		
		if(rowsAffected>0)
			System.out.println("Record Inserted");
		else
			System.out.println("No Record Insreted");
		
		ResultSet rs1=st.executeQuery("Select Employee_id,First_name,Last_name from Employee order by Employee_id;");
		System.out.println("EmployeeID  | First Name | LastName");
		while(rs1.next()) {
			System.out.println(rs1.getInt(1)+" | "+rs1.getString(2)+" | "+rs1.getString(3));
		}
		
		
	}
}
