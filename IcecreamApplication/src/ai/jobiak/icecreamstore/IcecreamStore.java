package ai.jobiak.icecreamstore;
import java.util.*;
public class IcecreamStore {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("         Welcome to home of Icecream"+"\n");
		
		System.out.println("select:  "+"1.Admin"+"\n"+"         2.User");
		int n=sc.nextInt();
		if(n==1) {
			Admin john=new Admin("Johndoe7@gmail.com","john@123");
			boolean b=john.validate();
			if(b==false) {
				System.out.println("select:  "+"1.Admin"+"\n"+"         2.User");
				n=sc.nextInt();
				john.validate();
			}
			
		}
		else if(n==2) {
			
		}

	}

}
