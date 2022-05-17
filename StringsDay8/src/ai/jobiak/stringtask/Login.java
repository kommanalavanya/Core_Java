package ai.jobiak.stringtask;

import java.util.Scanner;

public class Login {
	String email;
	String password;
	CreateAccount acc=new CreateAccount();
	Scanner sc=new Scanner(System.in);
    public Login() {
	
	}
    public void logindetails() {
    	System.out.println(acc.getEmail());
    	System.out.println(acc.getPassword());
    	
    }

}
