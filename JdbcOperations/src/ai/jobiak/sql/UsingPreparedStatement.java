package ai.jobiak.sql;
import java.sql.*;
public class UsingPreparedStatement {

	public static void main(String[] args)throws Exception {
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/college";
		Connection con=DriverManager.getConnection(url, userName, password);
        String query="INSERT INTO STUDENT VALUES(?,?,?,?,?)";
        PreparedStatement stmt=con.prepareStatement(query);
        stmt.setInt(1, 119);
        stmt.setString(2, "cathreine");
        stmt.setInt(3, 24);
        stmt.setString(4, "f");
        stmt.setInt(5, 99);
        int res=stmt.executeUpdate();
        System.out.println(res);
        
	}

}
