package ai.jobiak.java8;

import java.util.Optional;

public class TestOptional {
	static void method(String input) {
		if(input!=null) {
			System.out.println(input.length());
		}
	}

	public static void main(String[] args) {
	   String str=null;
	   String str2=new String("hello");
	  // Optional option1=Optional.of(str);//throws null pointer exception
	   //method(str);
	  // Optional option1=Optional.of(str2);
	   //System.out.println(option1.get());
	   //Optional option1=Optional.ofNullable(str);
	   //System.out.println(option1.get());
	   
	  // Optional option2=Optional.ofNullable(str2);
	   //System.out.println(option2.get());
//	   Optional option1=Optional.ofNullable(str);
//	  if(option1.isPresent()) {
//		  System.out.println(option1.get());
//	  }
	   Optional option1=Optional.ofNullable(str);
	   System.out.println(option1.orElse("Alternate string"));
	   
	   Optional option2=Optional.ofNullable(str2);
	   System.out.println(option2.orElse("Alternate string"));
	   
	   
	   
	   
	}

}
