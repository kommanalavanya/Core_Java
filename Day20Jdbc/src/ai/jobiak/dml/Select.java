package ai.jobiak.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {

	public static void main(String[] args) {
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/employee";
		String QUERY = "SELECT eID, NAME FROM emp1";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection con=DriverManager.getConnection(url,userName,password);
			Statement st=con.createStatement();
			 ResultSet rs = st.executeQuery(QUERY);
		 while(rs.next()){
            //Display values
            System.out.println("ID: " + rs.getInt("eID"));
            System.out.println("NAME: " + rs.getString("NAME"));
        }
	} catch(SQLException e) {
		e.printStackTrace();
	}

	}

}
