package ai.jobiak.day24;
import java.sql.*;
public class TestResultSet2 {

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

		
			Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			String selectSQL="select*from customer";
			ResultSet rs=st.executeQuery(selectSQL);
			if(rs.next()) {
				rs.moveToInsertRow();
				rs.updateInt(1, 112);
				rs.updateString(2, "Mitchel Lee");
				rs.updateDouble(3, 890);
				rs.insertRow();
				rs.last();
				System.out.println(rs.getInt(1)+"::"+rs.getString(2)+"::"+rs.getString(3));
				
			}

		} catch(SQLException e) {
			e.printStackTrace();
		}
		

      }
}
