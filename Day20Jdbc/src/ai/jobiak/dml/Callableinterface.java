package ai.jobiak.dml;
import java.sql.*;
public class Callableinterface {

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
	       
        String sql_string = "insert into emp1 values(?,?,?)";
       
        // Preparing a CallableStateement
        CallableStatement cs = con.prepareCall(sql_string);
       
        cs.setInt(1, 105);
        cs.setString(2, "arun");
        cs.setString(3, "arun7@gmail.com");
        cs.execute();
        System.out.print("uploaded successfully\n");
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
