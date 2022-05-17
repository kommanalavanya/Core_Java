package ai.jobiak.day24;
import java.sql.*;
public class TestCallableFunction {

	public static void main(String[] args) throws Exception{
	
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		
			Connection con=DriverManager.getConnection(url,userName,password);
			CallableStatement stmt=con.prepareCall("{?=call addbalance(?,?)}");
			stmt.registerOutParameter(1, Types.BOOLEAN);
			stmt.setInt(2, 103);
			stmt.setDouble(3, 500);
			stmt.execute();
			System.out.println(stmt.getBoolean(1));
			
			
			
			
			

		

      }
}
