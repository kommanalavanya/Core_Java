package ai.jobiak.collections;
//import java.math.BigInteger;
//import java.time.LocalDateTime;
import java.util.*;
public class TestHashSet2 {

	public static void main(String[] args) {
		
   HashSet<String> colors=new HashSet<String>();
   colors.add("blue");
   colors.add("red");
   colors.add("green");
   colors.add("pink");
   colors.add("green");
   colors.add("orange");
   colors.add("yellow");
 
   Iterator<String> iter=colors.iterator();
   
   
   while(iter.hasNext()) {
	   System.out.println(iter.next().toUpperCase());
   }
   HashSet<Integer> numbers=new HashSet<Integer>();
   numbers.add(1);
   numbers.add(2);
   numbers.add(3);
   numbers.add(4);
   numbers.add(5);
   Iterator<Integer> iter1=numbers.iterator();
   while(iter1.hasNext()) {
	   System.out.println(iter1.next());
   }
   for(Object obj:colors) {
	   System.out.println(obj);
   }
   
	}

}
