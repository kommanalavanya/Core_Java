package ai.jobiak.aadharseva;
import java.sql.*;
import java.util.*;
public class CreateAadhar {
    
          void fillform() throws Exception
		 {
		Scanner sc=new Scanner(System.in);
		System.out.println("                    Aadhar card application form");
		System.out.println("Id:                 ");
		int id=sc.nextInt();
		
		System.out.println("Full Name:          ");
		
		String fname=sc.nextLine();
		//String ch=sc.next();
		System.out.println("age:                ");
		int age=sc.nextInt();
		System.out.println("Gender:             ");
		String  gender=sc.nextLine();
		System.out.println("Date of birth:       ");
		System.out.println("\n"+"Enter date of birth in YYYY-MM-DD format: ");
		String dob=sc.nextLine();
		System.out.println("Pincode:              ");
		String pincode=sc.next();
		System.out.println("Contact Details");
		System.out.println("Mobile Number:         ");
		String phoneno=sc.next();
		System.out.println("Email:                  ");
		String email=sc.next();
		System.out.println();
		System.out.println("Address");
		System.out.println("Door No:                ");
		String doorNo=sc.next();
		System.out.println("Village/town/city        ");
		String village=sc.next();
		System.out.println("District:                ");
		String district=sc.next();
		System.out.println("State:                   ");
		String state=sc.next();
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/OnlinePortal";
		Connection con=DriverManager.getConnection(url, userName, password);
		Address addref=new Address(doorNo,village,district,state);
		AadharCardApplication adharref=new AadharCardApplication
				(id,fname,age,gender,dob,pincode,phoneno,email,addref);
		String query="INSERT INTO aadhar VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stmt1=con.prepareStatement(query);
        stmt1.setInt(1, adharref.getAge());
        stmt1.setString(2, adharref.getFullName());
        stmt1.setInt(3, adharref.getAge());
        stmt1.setString(4, adharref.getGender());
        stmt1.setString(5, adharref.getDateOfBirth());
        stmt1.setString(6, adharref.getPincode());
        stmt1.setString(7, adharref.getPhoneNo());
        stmt1.setString(8, adharref.getEmail());
        stmt1.setString(9, addref.getDoorNo());
        stmt1.setString(10, addref.getVillage());
        stmt1.setString(11, addref.getCity());
        stmt1.setString(12, addref.getState());
        int res=stmt1.executeUpdate();
        System.out.println(res);
        sc.close();
		 
		
		
	}
		
		

	

}
