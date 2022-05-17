package ai.jobiak.icecreamstore;
import java.util.*;
public class UserInfo {
	Scanner sc=new Scanner(System.in);
	String firstName;
	String lastName;
	String username;
	String password;
	Long phoneno;
	public UserInfo() {
		// TODO Auto-generated constructor stub
	}
	public void createAccount() {
		System.out.println("           Your Details       "+"\n");
		System.out.println("FirstName          ");
		firstName=sc.next();
		System.out.println("LastName          ");
		lastName=sc.next();
		System.out.println("phoneno           ");
		phoneno=sc.nextLong();
		System.out.println("username:          ");
		username=sc.next();
		System.out.println("password:          ");
		password=sc.next();	
	}
	public boolean login() {
		System.out.println("username:    ");
		String uname=sc.next();
		System.out.println("password:    ");
		String pwd=sc.next();
		if((uname!=username) && (pwd!=password)) {
			System.out.println("Incorrect username or password please login again");
			return false;
		}
		return true;
	}
	
	

}
