import java.util.*;
import java.util.stream.Collectors;
public class SquareOfNumber {

	public static void main(String[] args) {
	List<Integer> num= Arrays.asList(2,3,4,5);
	System.out.println("USing map"+"\n");
	System.out.println();
    List<Integer> square =num.stream().map(x->x*x).collect(Collectors.toList());
    System.out.println(square);
    
    
	}

}
