package ai.jobiak.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertValues {

	public static void main(String[] args) {
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/employee";
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection con=DriverManager.getConnection(url,userName,password);
			Statement st=con.createStatement();
			
			 String sql = "INSERT INTO emp1 VALUES (100, 'Zara', 'johndoe@gmail.com')";
	         st.executeUpdate(sql);
	         sql = "INSERT INTO emp1 VALUES (101, 'Mahnaz', 'jsonndoe@gmail.com')";
	         st.executeUpdate(sql);
	        
	         sql = "INSERT INTO emp1 VALUES(103, 'Sumit', 'jyo8@gmail.com')";
	         sql = "INSERT INTO emp1 VALUES(104, 'Sanjay', 'jay8@gmail.com')";
	         st.executeUpdate(sql);
	         System.out.println("Inserted records into the table..."); 
	        
		} catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
