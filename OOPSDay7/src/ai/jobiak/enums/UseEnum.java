package ai.jobiak.enums;

import ai.jobiak.taskenums.Months;

public class UseEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple apple=Apple.Kashmir;
		System.out.println(apple);
		for(Apple element:Apple.values()) {
			System.out.println(element+"  "+element.ordinal());
			                                       //index
			
		}
	     Months m=Months.January;
	     System.out.println(m);

	}

}
