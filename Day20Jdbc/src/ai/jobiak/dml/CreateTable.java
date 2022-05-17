package ai.jobiak.dml;

import java.sql.*;

public class CreateTable {
	public static void main(String[] args) {
		
		String create_table="CREATE TABLE emp1("
	            + "eID INT NOT NULL,"
	            + "NAME VARCHAR(45) NOT NULL,"
	           
	            + "EMAIL VARCHAR(45) NOT NULL,"
	            + "PRIMARY KEY (eID))";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/employee";
		try {
			Connection con=DriverManager.getConnection(url,userName,password);
			Statement st=con.createStatement();
			st.executeUpdate(create_table);
			 System.out.println("Table created");
		} catch(SQLException e) {
			e.printStackTrace();
		}
		

	}

}
