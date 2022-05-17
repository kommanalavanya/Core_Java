package ai.jobiak.sql;

import java.sql.*;

public class CreateTable {

	public static void main(String[] args)throws Exception {
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/college";
		Connection con=DriverManager.getConnection(url, userName, password);
		Statement stmt=con.createStatement();
		String sql="CREATE TABLE STUDENT"
		
		+"("
		+"sid INTEGER not NULL,"
		+"sname VARCHAR(14),"
		 +"age INTEGER,"
		 +"gender VARCHAR(1),"
		  +"marks INTEGER, "
		  +" PRIMARY KEY ( sid )"
		  +")";
		 stmt.executeUpdate(sql);
		 System.out.println("created table in the database");
		

	}

}
