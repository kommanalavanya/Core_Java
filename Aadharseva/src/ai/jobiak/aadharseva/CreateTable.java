package ai.jobiak.aadharseva;

import java.sql.*;



public class CreateTable {

	public static void main(String[] args)throws Exception {
		
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/OnlinePortal";
		Connection con=DriverManager.getConnection(url, userName, password);
		
		Statement stmt=con.createStatement();
		String sql="CREATE TABLE aadhar"+
				"(id INTEGER,"+
				"name varchar(14),"+
				"age INTEGER,"+
				 "gender varchar(1),"+
				 "DateofBirth VARCHAR(15),"+
				  "pincode VARCHAR(15), "+
				  " phoneno VARCHAR(15), "+
				  " email VARCHAR(45), "+
				  " doorNo VARCHAR(15), "+
				  " village VARCHAR(15), "+
				  " district VARCHAR(15), "+
				  "state VARCHAR(15), "+
				  " PRIMARY KEY ( pincode ))";
		stmt.executeUpdate(sql);
		System.out.println("table created");
		 
		
		
	}
}
	