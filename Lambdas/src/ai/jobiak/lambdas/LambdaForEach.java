package ai.jobiak.lambdas;

import java.util.ArrayList;
import java.util.List;

public class LambdaForEach {

	public static void main(String[] args) {
		List<String> fruits=new ArrayList<>();
		fruits.add("mango");
		fruits.add("pineapple");
		fruits.add("watermelon");
		fruits.forEach(
				(n)->System.out.println(n)
				
				);

	}

}
