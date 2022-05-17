import java.sql.*;
public class InsertRecords {

	public static void main(String[] args)throws Exception {
		 Class.forName("com.mysql.cj.jdbc.Driver");
         String userName="root";
         String password="admin";
         String url="jdbc:mysql://localhost:3306/college";
         Connection con=DriverManager.getConnection(url, userName, password);
         String sql="INSERT INTO Department VALUES(?,?,?)";
         Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
         PreparedStatement ps=con.prepareStatement(sql);
      
         ps.setString(1,"cse");
         ps.setInt(2, 101);
         ps.setString(3, "abc");
         ps.setString(1, "eee");
         ps.setInt(2, 103);
         ps.setString(3, "xyz");
         ps.execute();
         System.out.println("Inserted recors into table");
        ResultSet rs=ps.executeQuery("select *from Department");
        
       
    	System.out.println("Using next");
        while(rs.next()) {
        	System.out.println("deptname "+rs.getString(1));
        	System.out.println("deptid    "+rs.getInt(2));
        	System.out.println("hod        "+rs.getString(3));
        }
        System.out.println("using last");
        ResultSet rs1=st.executeQuery("select *from Department");
        rs1.last();
        
        System.out.println("deptname "+rs1.getString(1));
    	System.out.println("deptid    "+rs1.getInt(2));
    	System.out.println("hod        "+rs1.getString(3));
    	
	}

}
