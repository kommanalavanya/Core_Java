import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		List<Integer> number=Arrays.asList(1,2,3,4,5,6,2);
		System.out.println("----------map-----------");
        List<Integer> square=number.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(square);
        System.out.println("--------filter----------");
        List<Integer> even=number.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(even);
        System.out.println("-----Sorted------");
        List<Integer> sort=number.stream().collect(Collectors.toList());
        System.out.println(sort);
        System.out.println("------reduce---------");
        Integer add=number.stream().reduce(0,(i,j)->i+j);
        System.out.println(add);
        number.stream().map(x->x*x).forEach(s->System.out.print(s+" "));
        System.out.println();
        number.stream().map(x->x*x).forEach(System.out::println);
	}

}
