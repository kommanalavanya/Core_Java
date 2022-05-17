import java.util.*;
import java.sql.*;
public class JobiakInbox {

	public static void main(String[] args)throws Exception {
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/onlineportal";
		Connection con=DriverManager.getConnection(url, userName, password);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("                       Jobiak Inbox");
		System.out.println("select from any of the below");
		System.out.println("1.First");
		System.out.println("2.Next");
		System.out.println("3.Previous");
		System.out.println("4.Last");
		System.out.println("5.Go to");
		System.out.println("6.Exit");
		int ch=sc.nextInt();
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		ResultSet rs=st.executeQuery("select *from jobiakmail");
		while(ch!=6) {
			if(ch==1) {
				
				
				rs.first();
				System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3)+rs.getInt(4));
				
			}
			else if(ch==2) {
				rs.next();
				System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3)+rs.getInt(4));
				
			}
			else if(ch==3) {
				
					rs.previous();
					System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3)+rs.getInt(4));
				
			
				
				
			}
			else if(ch==4) {
				rs.last();
				System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3)+rs.getInt(4));
			}
			else if(ch==5) {
				System.out.println("enter mailno");
				int mailno=sc.nextInt();
				rs.absolute(mailno);
				System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3)+rs.getInt(4));
			}
			System.out.println("select the options from any of the above");
			ch=sc.nextInt();
			
		}
		

	}

}
