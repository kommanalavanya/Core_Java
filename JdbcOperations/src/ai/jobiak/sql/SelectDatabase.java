package ai.jobiak.sql;

import java.sql.*;

public class SelectDatabase {

	public static void main(String[] args)throws Exception {
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/college";
		Connection con=DriverManager.getConnection(url, userName, password);
		System.out.println("connected to college database successfully");

	}

}
