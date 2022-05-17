package com.jobiak.java8;
import java.util.function.Function;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
public class TestFunctionals {

	public static void main(String[] args) {
		Function<String,Integer> lengthfunction=(String str)->{return str.length();};
		Function<String,Integer> halfLengthfunction=(String str)->{return str.length()/2;};
       ArrayList<String> fruits=new ArrayList<>();
     fruits.add("mango");
     fruits.add("orange");
     fruits.add("pineapple");
     fruits.add("grapes");
     List<Integer> lengthlist=method(fruits,lengthfunction);
     System.out.println(lengthlist);
     List<Integer> halflengthlist=method(fruits,halfLengthfunction);
     System.out.println(halflengthlist);
          
	}
	static List<Integer> methodHalfLength(ArrayList<String> list,Function<String,Integer>functionparam)
	{
		ArrayList<Integer> intList=new ArrayList<>();
		for(String str:list) {
			int length=functionparam.apply(str);
			intList.add(length);
			
		}
		return intList;
	}
	static List<Integer> method(ArrayList<String> list,Function<String,Integer>functionparam)
	{
		ArrayList<Integer> intList=new ArrayList<>();
		for(String str:list) {
			int length=functionparam.apply(str);
			intList.add(length);
			
		}
		return intList;
	}
}
