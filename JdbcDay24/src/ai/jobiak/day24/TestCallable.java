package ai.jobiak.day24;
import java.sql.*;
public class TestCallable {

	public static void main(String[] args) throws Exception{
	
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		
			Connection con=DriverManager.getConnection(url,userName,password);
			System.out.println("connected to db....");
			CallableStatement cs=con.prepareCall("{call updateBalance(?,?)}");
			cs.setInt(1, 105);
			cs.setDouble(2, 600);
			boolean result=cs.execute();
			System.out.println(result);
			

		

      }
}
