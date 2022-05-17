import java.sql.*;
public class CreateTable {

	public static void main(String[] args)throws Exception {
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/onlineportal";
		Connection con=DriverManager.getConnection(url, userName, password);
		Statement stmt=con.createStatement();
		String sql="CREATE TABLE JOBIAKMAIL("
	            + "FROMNAME VARCHAR(60),"
	            + "SUBJECT VARCHAR(60),"
	           
	            + "CONTENT VARCHAR(80) ,"
	            + "SIZE INTEGER)";
		 stmt.execute(sql);
	}

}
