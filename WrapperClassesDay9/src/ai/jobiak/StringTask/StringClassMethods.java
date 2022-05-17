package ai.jobiak.StringTask;

public class StringClassMethods {

	public static void main(String[] args) {
		System.out.println("                           String class Methods");
		System.out.println();
		System.out.println("It returns a character at a specific index position in a string");
		String s1="java";
		char ch=s1.charAt(3);
		System.out.println(ch);
		System.out.println();
		String s2="Java is Sandbox";
		System.out.println("The length of the string is"+" "+s2.length());
		System.out.println();
		System.out.println("The java string format() method returns the formatted string by arguments");
       String s3="Java is Robust";
       String sf1=String.format("String is %s",s3);
       System.out.println(sf1);
       String sf2=String.format("value is %f",24.5);
       System.out.println(sf2);
       String sf3=String.format("value is %24.12f", 24.5);
       System.out.println(sf3);
       System.out.println();
       System.out.println("The Java String class substring() method returns a part of the string.");
       String s4="JavaHome";
       String substr1=s4.substring(0);
       System.out.println(substr1);
       String substr2=s4.substring(4, 8);
       System.out.println(substr2);
       System.out.println();
       System.out.println("The Java String class contains() method searches the sequence of characters in this string."
       		+ " It returns true if the sequence of char values is found in this string otherwise returns false.");
       String s5="What do you know about Java";
       System.out.println("abou Java contains in the string "+s5+" so the result is "+s5.contains("about Java"));
       System.out.println(" it is not present in string so it returns "+s5.contains("java"));
       System.out.println();
      System.out.println("It concat Strings");
      String s6="Java is";
      String s7=" Object oriented";
      String s8=" Programming language";
      System.out.println(s6.concat(s7).concat(s8));
       
       
	}

}
