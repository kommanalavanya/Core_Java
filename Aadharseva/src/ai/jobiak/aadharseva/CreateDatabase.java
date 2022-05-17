package ai.jobiak.aadharseva;

import java.sql.*;

public class CreateDatabase {

	public static void main(String[] args)throws Exception {
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/";
		Connection con=DriverManager.getConnection(url, userName, password);//connection establish
		Statement stmt=con.createStatement();
		String sql="CREATE DATABASE OnlinePortal";
	    stmt.executeUpdate(sql);
	    System.out.println("database created successfully");

	}

}
