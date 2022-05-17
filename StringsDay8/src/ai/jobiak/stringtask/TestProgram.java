package ai.jobiak.stringtask;

import java.util.Scanner;

public class TestProgram {

	public static void main(String[] args) {
		System.out.println("To count no. of i's in string");
		CountLetters obj1=new CountLetters("Mississippi");
		obj1.count(obj1.s);
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("to check whether string is palindrome or not");
		System.out.println("enter the string ");
		String s1=sc.next();
		Palindrome obj2=new Palindrome(s1);
		obj2.print(s1);
		System.out.println();
		System.out.println("To Convert lower case to Upper case");
		System.out.println("enter String");
		String s2=sc.next();
		ReplaceCase obj3=new ReplaceCase(s2);
		obj3.print(s2);

	}

}
