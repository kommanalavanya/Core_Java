import java.sql.*;
public class TestJdbc1 {

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
			DatabaseMetaData dmd=(DatabaseMetaData) con.getMetaData();
			System.out.println(dmd.getDriverName());
			System.out.println(dmd.getDriverVersion());
			System.out.println(dmd.getDatabaseProductName());
			System.out.println(dmd.getDriverMinorVersion());
			
			
			Statement st=con.createStatement();
			String selectSQL="select*from country";
			ResultSet rs=st.executeQuery(selectSQL);
			while(rs.next()) {
				System.out.println(rs.getString(1)+"::"+rs.getString(2));
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		



	}

}
