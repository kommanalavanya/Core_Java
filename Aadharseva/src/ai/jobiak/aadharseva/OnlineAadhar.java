package ai.jobiak.aadharseva;

import java.util.Scanner;



public class OnlineAadhar {

	public static void main(String[] args) throws Exception {
		
		System.out.println("                           Online AadharSeva");
		System.out.println("1. Apply for new Aadhar");
		System.out.println("2. Modify Aadhar");
		System.out.println("3. View your  Aadhar");
		System.out.println("4.  Admin");
		Scanner sc = new Scanner(System.in);
		int op = sc.nextInt();
	

		int ch = 1;
		while (ch == 1) {

			switch (op) {
			case 1:
				CreateAadhar obj=new CreateAadhar();
				obj.fillform();
				break;
			case 2:
				 UpdateRecord obj1=new UpdateRecord();
				 obj1.modify();
				break;
			case 3:
				System.out.println();
				break;
			case 4:
				System.out.println();
				break;
				

			}
			System.out.println("if you want to exit press 0 else enter 1");
			int e = sc.nextInt();
			if (e == 0) {
				ch = 0;
			} else {
				System.out.println("1. Apply for new Aadhar");
				System.out.println("2. Modify Aadhar");
				System.out.println("3. View your  Aadhar");
				System.out.println("4.  Admin");
				op = sc.nextInt();
				ch = 1;

			}

		}

	}

}
