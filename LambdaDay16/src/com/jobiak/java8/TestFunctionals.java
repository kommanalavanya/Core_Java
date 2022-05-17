package com.jobiak.java8;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestFunctionals {

	public static void main(String[] args) {
		Function<String,Integer> lengthfunction=(String str)->{return str.length();};
      // int result=lengthfunction.apply("jobiak.com");
       //System.out.println(result);
      // System.out.println("jobiak.com".length());
       int result=lengthfunction.apply("jobiak.com");
       System.out.println(result);
      // System.out.println("jobiak.com".length());
       Predicate<Boolean> predicate=(Boolean)->{return 100>45;};
       System.out.println(predicate.test(true));
       Consumer<String> consumer=(String str)->{System.out.println(str);};
    consumer.accept("jobiak.ai");
       
	}

}
