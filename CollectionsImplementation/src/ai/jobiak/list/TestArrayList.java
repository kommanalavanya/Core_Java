package ai.jobiak.list;

import java.util.*;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<>();
		a1.add("water melon");
		a1.add("apple");
		a1.add("mango");
		a1.add("orange");
		
		System.out.println(a1);
		//accessing elements
		System.out.println(a1.get(1));
		//changing the element or replacing the element
		a1.set(1, "dates");
		System.out.println(a1);
		//sorting the list
		Collections.sort(a1);
		System.out.println(a1);
		//using iterator
		Iterator<String> iter=a1.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		//using list
		 ArrayList<String> list=new ArrayList<String>();
		 list.add("ravi");
		 list.add("vijay");
		 list.add("arjun");
		 System.out.println(list);
		 ListIterator<String> iter1=list.listIterator(list.size());
		//printing list in reverse order
		 while(iter1.hasPrevious()) {
			String str=iter1.previous();
			System.out.println(str);
		 }
		 //retain all
		List<Integer> num1=new ArrayList<>();
		num1.add(1);
		num1.add(2);
		num1.add(3);
		num1.add(4);
		num1.add(10);
		num1.add(10);
		System.out.println(num1);
		ArrayList<Integer> num2=new ArrayList<>();
		num2.add(1);
		num2.add(2);
		num2.add(3);
		num2.add(4);
		num2.add(5);
		num2.add(6);
		num2.add(7);
		num2.add(8);
		//replaceall
		System.out.println(Collections.replaceAll(num1,10,11));
		System.out.println(num1);
		System.out.println(num1.retainAll(num2));
		System.out.println(num1);
		
		//remove
		num1.remove(1);
		System.out.println(num1);
		ArrayList<String> birds=new ArrayList<>();
		birds.add("parrot");
		birds.add("sparrow");
		birds.add("peacock");
		birds.add("owl");
		System.out.println(birds);
		//remove by element
		birds.remove("peacock");
		System.out.println(birds);
		//contains method
		System.out.println(birds.contains("owl"));
		System.out.println();
		//index of
		System.out.println(birds.indexOf("owl"));
		//isempty method
		System.out.println(birds.isEmpty());
	
		//System.out.println(birds);
		 
	}

}
