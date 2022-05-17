package ai.jobiak.streams;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class TestStreams {

	public static void main(String[] args) {
		
      ArrayList<String> list=new ArrayList<>();
      list.add("Hello");	 list.add("Hola");  list.add("Bonjure"); list.add("buenos dias");
       list.stream().forEach(System.out::println);
       System.out.println();
       System.out.println("using consumer");
      Consumer<String> consumer=(str)->{ System.out.println(str);};
      list.stream().forEach(consumer);
      System.out.println();
      System.out.println("count of elements in list is ");
      
      long count=list.stream().count();
      System.out.println(count);
       List<String> letterBList=list.stream().filter(e->(e.charAt(0)=='B')).collect(Collectors.toList());
       	System.out.println(letterBList);
       	list.stream().map(e->e.toUpperCase()).forEach(consumer);
       	Function<String,String> uppercasefunction=(e)->{return e.toUpperCase();};
       	list.stream().map(uppercasefunction).forEach(consumer);
       	list.stream().map(e->e.substring(0, 3)).forEach(consumer);
       	Predicate<String> p=s->s.charAt(0)=='B';
       	list.stream().filter(p).forEach(consumer);
	}

}
