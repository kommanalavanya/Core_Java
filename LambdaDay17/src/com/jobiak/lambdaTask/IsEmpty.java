package com.jobiak.lambdaTask;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IsEmpty {

	public static void main(String[] args) {
	   List<String> fruits=Arrays.asList("orange","","apple","grapes","","watermelon");
       List<String>EmptyString=fruits.stream().filter(e->(e.isEmpty()))
    		   .collect(Collectors.toList());
       System.out.println(EmptyString);
	}

}
