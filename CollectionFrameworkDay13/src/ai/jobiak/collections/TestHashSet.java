package ai.jobiak.collections;
//import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.*;
public class TestHashSet {

	public static void main(String[] args) {
		
   HashSet colors=new HashSet();
   colors.add("blue");
   colors.add("red");
   colors.add("green");
   colors.add("pink");
   colors.add("green");
   colors.add("orange");
   colors.add("yellow");
   LocalDateTime dt=LocalDateTime.now();
   colors.add(dt);
   colors.add(new Boolean("false"));
   colors.add(new Integer("100"));
   colors.add(new Object());
   Iterator iter=colors.iterator();
   
   System.out.println(colors.size());
   System.out.println(colors);
   System.out.println(colors.contains("purple"));
   for(Object obj:colors) {
	   System.out.println(obj);
   }
	}

}
