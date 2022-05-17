package ai.jobiak.day24;
import java.sql.*;
public class TestResultSet {

	public static void main(String[] args) throws Exception{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		try {
			Connection con=DriverManager.getConnection(url,userName,password);
			System.out.println("connected to db....");
			//DatabaseMetaData dmd=(DatabaseMetaData) con.getMetaData();

		
			Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			String selectSQL="select*from customer where custid";
			ResultSet rs=st.executeQuery(selectSQL);
			//while(rs.next()) {
				rs.last();
				rs.previous();
				System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3));
				rs.first();
				System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3));
				rs.next();
				System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3));
				rs.absolute(3);
				System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3));
	
			//}
			ResultSetMetaData rsmd=rs.getMetaData();		

		} catch(SQLException e) {
			e.printStackTrace();
		}
		

      }
}
