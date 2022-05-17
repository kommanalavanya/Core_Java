import java.sql.*;
public class CreateTable {

	public static void main(String[] args) throws Exception {
		
          Class.forName("com.mysql.cj.jdbc.Driver");
          String userName="root";
          String password="admin";
          String url="jdbc:mysql://localhost:3306/college";
          Connection con=DriverManager.getConnection(url, userName, password);
          Statement st=con.createStatement();
          String sql="Create Table Department"
        		  +"("
        		  +"deptname varchar(10),"
        		  +"deptid int,"
        		  +"hod varchar(25)"
        		  +")";
          st.executeUpdate(sql);
          System.out.println("table is created");
	}
       
}
