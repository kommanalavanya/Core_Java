package ai.jobiak.sql;

import java.sql.*;

public class UpdateRecord {

	public static void main(String[] args)throws Exception {
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/college";
		Connection con=DriverManager.getConnection(url, userName, password);
		Statement stmt=con.createStatement();
		String sql="UPDATE STUDENT set sname='jyothi' where sid=105";
         stmt.executeUpdate(sql);
         String query="select *from STUDENT";
         ResultSet rs=stmt.executeQuery(query);
    while(rs.next()) {
    	System.out.println("ID: " + rs.getInt("sid"));
		System.out.println("Name: " + rs.getString("sname"));
		System.out.println("Age: " + rs.getInt("age"));
		System.out.println("Gender: " + rs.getString("gender"));
		System.out.println("Marks: " + rs.getInt("marks"));
    }
	}

}
