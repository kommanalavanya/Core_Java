package ai.jobiak.csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;

public class Test2Csv {

	public static void main(String[] args) throws Exception{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		
		Connection con=DriverManager.getConnection(url,userName,password);
		String filePath="C:\\Users\\Jobiak\\Downloads\\courseList.csv";
		int batchSize=10;
		String sql="insert into courselist(CourseName,StudentName)"+"values(?,?)";
		PreparedStatement statement=con.prepareStatement(sql);
		BufferedReader  lineReader=new BufferedReader(new FileReader(filePath));
		String lineText=null;
		int count=0;
		lineReader.readLine();
		while((lineText=lineReader.readLine())!=null) {
			String[] data=lineText.split(",");
			String empid=data[0];
			String empName=data[1];
			String Gender=data[2];
			String age=data[3];
			String Country=data[4];
			String salary=data[5];
			
			statement.setString(1, empid);
			statement.setString(2, empName);
			statement.setString(3, Gender);
			statement.setString(4, age);
			
			statement.addBatch();
			if(count%batchSize==0) {
				statement.executeBatch();
			}
			Statement st=con.createStatement();
			String selectSQL="select*from courselist";
			ResultSet rs=st.executeQuery(selectSQL);
			while(rs.next()) {
				System.out.println(rs.getString(1)+"::"+rs.getString(2));
			}
			
		}
			
		lineReader.close();

	}

}
