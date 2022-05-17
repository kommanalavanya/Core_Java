import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
public class FilterMap {

	public static void main(String[] args) {
		
         List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
         List<Integer> evennumbers=list.stream().filter(n->n%2==0)
        		 .collect(Collectors.toList());
         System.out.println(evennumbers);
         List<Integer> double1=list.stream().map(n->n*2)
        		 .collect(Collectors.toList());
         System.out.println(list);
         System.out.println(double1);
         list.stream().filter(n->n%2!=0).forEach(System.out::println);
	}

}
