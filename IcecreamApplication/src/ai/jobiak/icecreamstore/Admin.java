package ai.jobiak.icecreamstore;

import java.util.Scanner;

public class Admin {
	Scanner sc=new Scanner(System.in);
	String username;
	String password;

	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public Admin(String username, String password) {
		this.username = username;
		this.password = password;
	}
	public boolean validate() {
          String uname=sc.next();
          String pwd=sc.next();
          if((uname!=username) &&(pwd!=password)) {
        	  System.out.println("You are not eligible to enroll please try to login as user");
        	  return false;
          }
          return true;
	}

}
