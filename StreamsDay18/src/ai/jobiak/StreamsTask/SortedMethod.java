package ai.jobiak.StreamsTask;

import java.util.*;
import java.util.List;
import java.util.function.Consumer;

public class SortedMethod {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,9,87,4,5,6,7);
		Consumer<Integer> consumer=(Integer num)->{System.out.println(num);};
		list.stream().sorted().forEach(consumer);
		

	}

}
