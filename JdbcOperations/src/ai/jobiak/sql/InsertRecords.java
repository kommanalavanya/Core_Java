package ai.jobiak.sql;

import java.sql.*;

public class InsertRecords {

	public static void main(String[] args)throws Exception {
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/college";
		Connection con=DriverManager.getConnection(url, userName, password);
		Statement stmt=con.createStatement();
		System.out.println("inserting records into table");
		String sql="INSERT  INTO STUDENT VALUES(101,'arun',21,'m',95)";
		stmt.executeUpdate(sql);
		sql="INSERT  INTO STUDENT VALUES(102,'varun',20,'m',87)";
		stmt.executeUpdate(sql);
		sql="INSERT  INTO STUDENT VALUES(103,'lavanya',22,'f',89)";
		stmt.executeUpdate(sql);
		sql="INSERT  INTO STUDENT VALUES(104,'arjun',20,'m',86)";
		stmt.executeUpdate(sql);
		sql="INSERT  INTO STUDENT VALUES(105,'jyo',23,'f',85)";
		stmt.executeUpdate(sql);
		sql="INSERT  INTO STUDENT VALUES(106,'vinay',20,'m',75)";
		stmt.executeUpdate(sql);
		sql="INSERT  INTO STUDENT VALUES(107,'kavya',23,'f',89)";
		stmt.executeUpdate(sql);
		sql="INSERT  INTO STUDENT VALUES(108,'aman',27,'m',89)";
		stmt.executeUpdate(sql);
		sql="INSERT  INTO STUDENT VALUES(109,'kalyan',22,'m',81)";
		stmt.executeUpdate(sql);
		sql="INSERT  INTO STUDENT VALUES(110,'vijay',26,'m',86)";
		stmt.executeUpdate(sql);
		sql="INSERT  INTO STUDENT VALUES(111,'hardik',20,'m',71)";
		stmt.executeUpdate(sql);
		sql="INSERT  INTO STUDENT VALUES(112,'sania',21,'f',65)";
		stmt.executeUpdate(sql);
		sql="INSERT  INTO STUDENT VALUES(113,'sindhu',23,'f',54)";
		stmt.executeUpdate(sql);
		sql="INSERT  INTO STUDENT VALUES(114,'mithali',24,'f',84)";
		stmt.executeUpdate(sql);
		sql="INSERT  INTO STUDENT VALUES(115,'kohli',23,'m',99)";
		stmt.executeUpdate(sql);
		sql="INSERT  INTO STUDENT VALUES(116,'sonia',23,'f',67)";
		stmt.executeUpdate(sql);
		sql="INSERT  INTO STUDENT VALUES(117,'malliswari',22,'f',76)";
		stmt.executeUpdate(sql);
		sql="INSERT  INTO STUDENT VALUES(118,'dhoni',22,'m',97)";
		stmt.executeUpdate(sql);
		System.out.println("inserted recors into table");
	
		
	}

}
