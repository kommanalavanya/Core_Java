package ai.jobiak.StringTask;

public class StringClassConstructors {
	public static void main(String[] args) {
		System.out.println("                           String class Constructors");
		System.out.println();
		String s1=new String();
		System.out.println("To create an empty String, we will call the default constructor"+s1);
		System.out.println();
		System.out.println("It will create a string object and stores the given value in it");
		
		String s2=new String("Hello Java");
		System.out.println(s2);
		System.out.println();
		char[] ch1= {'j','a','v','a'};
		System.out.println("This constructor creates a string object and stores the array of characters in it");
		String s3=new String(ch1);
		System.out.println(s3);
		System.out.println();
		System.out.println("The argument startIndex specifies the index at which the subrange begins "
				+ "and count specifies the number of characters to be copied.");
		char[] ch2= {'w','i','n','d','o','w'};
		String s4=new String(ch2,0,4);
		System.out.println(s4);
		System.out.println();
		System.out.println("It decodes the ASCII values into the characters");
		byte[] b1= { 97, 98, 99, 100 };
		String s5=new String(b1);
		System.out.println(s5);
		System.out.println();
		System.out.println("It decodes the ASCII values into the characters by taking range");
		byte[] b2= {65, 66, 67, 68, 69, 70 };
		String s6=new String(b2,2,4);
		System.out.println(s6);
		System.out.println();
		System.out.println("This constructs a new string from Stringbuilder");
		StringBuilder sb=new StringBuilder("Java");
		String s7=new String(sb);
		System.out.println(s7);
		System.out.println();
		System.out.println("This constructs a new string from Stringbuffer");
		StringBuffer sf=new StringBuffer("Java");
		String s8=new String(sf);
		System.out.println(s8);
		
		
		
	}

}
