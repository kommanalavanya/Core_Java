import java.util.*;

public class ForEach {

	public static void main(String[] args) {
		List<String> gamesList = new ArrayList<String>();  
        gamesList.add("Football");  
        gamesList.add("Cricket");  
        gamesList.add("Chess");  
        gamesList.add("Hocky");  
        System.out.println("------------Iterating by passing lambda expression--------------");  
        //gamesList.forEach(games -> System.out.println(games));
        System.out.println("Using lambda"+"\n");
        gamesList.forEach(g->System.out.println(g)); 
        System.out.println();
        System.out.println("using double colon operator"+"\n");
        gamesList.forEach(System.out::println);
	}

}
