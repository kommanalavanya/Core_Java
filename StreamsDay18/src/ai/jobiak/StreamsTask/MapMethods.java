package ai.jobiak.StreamsTask;

import java.util.Arrays;
import java.util.List;


public class MapMethods {

	
	public static void main(String[] args) {
		
		List<Integer> nums=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		nums.stream().map(i->i*i).forEach(s->System.out.print(s+" "));
		System.out.println();
		nums.stream().map(i->i*i).forEach(s->System.out.print(s+" "));
		System.out.println();
		nums.stream().mapToLong(i->i*i).forEach(s->System.out.print(s+" "));
		System.out.println();
		nums.stream().mapToDouble(i->i*i).forEach(s->System.out.print(s+" "));
	}

}
