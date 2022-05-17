package ai.jobiak.sql;
import java.sql.*;
public class CallableStatementInterface {

	public static void main(String[] args)throws Exception {
		 String userName="root";
         String password="admin";
         String url="jdbc:mysql://localhost:3306/college";
         Connection con=DriverManager.getConnection(url, userName, password);
       CallableStatement cstmt=con.prepareCall("{call updatename(?,?)}");
       cstmt.setInt(1, 116);
       cstmt.setString(2, "sofia");
       boolean result=cstmt.execute();
       System.out.println(result);
	}

}
