package ai.jobiak.aadharseva;
import java.sql.*;
import java.util.*;
public class UpdateRecord {

	
		 public void modify() throws Exception {
			 String userName="root";
				String password="admin";
				String url="jdbc:mysql://localhost:3306/OnlinePortal";
				Connection con=DriverManager.getConnection(url, userName, password);
				Statement stmt=con.createStatement();
			   System.out.println("Select any of the following Aadhar data to update");
			    System.out.println("1.Name");
			    System.out.println("2.age");
				System.out.println("3.Gender");
				System.out.println("4.Address");
				System.out.println("5.Email");
				System.out.println("6.DateofBirth");
				System.out.println("7.Pincode");
				System.out.println("8.Mobhileno");
			
				Scanner sc=new Scanner(System.in);
				String ch;
				int op=sc.nextInt();
				
		      System.out.println("enter your loginid");
		         int id=sc.nextInt();
					switch (op) {
					case 1:
						
						System.out.println("Edit Name");
						System.out.println("Enter your name");
						String name=sc.nextLine();
						 ch=sc.next();
						String sql="UPDATE aadhar set sname=name where sid=id";
						 stmt.executeUpdate(sql);
						
						break;
					case 2:
						
						System.out.println("Edit Age");
						System.out.println("Enter your Age");
						int editage=sc.nextInt();
						String sql1="UPDATE aadhar set age=editage where sid=id";
						 stmt.executeUpdate(sql1);
						break;
					case 3:
						
						System.out.println("Edit Gender");
						System.out.println("Enter your Gender");
						String editgender=sc.nextLine();
						 ch=sc.next();
						String sql2="UPDATE aadhar set gender=editgender where sid=id";
						 stmt.executeUpdate(sql2);
						break;
					case 4:
						
						System.out.println("Edit Address");
						System.out.println("select any one of the following to update");
						System.out.println("1.doorNo");
						System.out.println("2.Village");
						System.out.println("3.City");
						System.out.println("4.State");
						int op1=sc.nextInt();
						if(op==1) {
							String editDoorNo=sc.nextLine();
						 ch=sc.next();
							String sql3="UPDATE aadhar set doorNo=editDoorNo where sid=id";
							 stmt.executeUpdate(sql3);
						}
						else if(op==2) {
						String editVillage=sc.nextLine();
						 ch=sc.next();
						String sql3="UPDATE aadhar set village=editVillage where sid=id";
						 stmt.executeUpdate(sql3);
						}
						
						else if(op==3) {
							String editCity=sc.nextLine();
							ch=sc.next();
							String sql3="UPDATE aadhar set district=editCity where sid=id";
							stmt.executeUpdate(sql3);
						}
						else if(op==4) {
							String editState=sc.nextLine();
							ch=sc.next();
							String sql3="UPDATE aadhar set state=editState where sid=id";
							stmt.executeUpdate(sql3);
						}
						break;
					case 5:
					
						System.out.println("Edit Email");
						System.out.println("Enter your Email");
						String editEmail=sc.nextLine();
						 ch=sc.next();
						 String sql4="UPDATE aadhar set email=editEmail where sid=id";
						 stmt.executeUpdate(sql4);
						break;
					case 6:
					
						System.out.println("Edit Pincode");
						System.out.println("Enter your Pincode");
						String editPincode=sc.nextLine();
						 ch=sc.next();
						String sql5="UPDATE aadhar set pincode=editPincode where sid=id";
						stmt.executeUpdate(sql5);
						break;
						
					case 7:
						System.out.println("Edit MobileNo");
						System.out.println("Enter your MobileNo");
						String editMobileNo=sc.nextLine();
						 ch=sc.next();
						 String sql6="UPDATE aadhar set phoneno=editMobileNo where sid=id";
						 stmt.executeUpdate(sql6);
						break;
						

					
					

				}
		       
		}
		
	}


