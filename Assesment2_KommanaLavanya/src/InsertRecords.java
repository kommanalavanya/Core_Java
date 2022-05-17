import java.sql.*;
import java.util.*;
public class InsertRecords {
	public static void main(String[] args)throws Exception {
		
	Scanner sc=new Scanner(System.in);
	String userName="root";
	String password="admin";
	String url="jdbc:mysql://localhost:3306/onlineportal";
	Connection con=DriverManager.getConnection(url, userName, password);
	String query="INSERT INTO JOBIAKMAIL VALUES(?,?,?,?)";
    PreparedStatement ps=con.prepareStatement(query);
   
    String from=sc.nextLine();
	String subject=sc.nextLine();
	String content=sc.nextLine();
	
	ps.setString(1, from);
	ps.setString(2,subject);
	ps.setString(3, content);
	ps.setInt(4,content.length());
	ps.executeUpdate();
	
		
	}
}
