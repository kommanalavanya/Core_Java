package ai.jobiak.collections;

import java.util.*;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<String> bookList = new ArrayList<String>();
		System.out.println(bookList.size());
		bookList.add("Thinking in Java");
		bookList.add("Java Unleashed");
		bookList.add("Java For Dummies");
		bookList.add("HeadFirstJava");
		bookList.add("Java in Action");
		System.out.println(bookList.size()+"\n");
		System.out.println(bookList);
		bookList.add("Thinking in Java");
		System.out.println(bookList.size()+"\n");
		System.out.println("After adding duplicate elements   "+bookList);
		bookList.add(null);
		System.out.println(bookList);
		/*bookList.add("Head First Design Patterns");
		bookList.add("The Java EE");
		System.out.println(bookList.size());
		System.out.println(bookList.get(5));
		System.out.println(bookList.contains("Java in Action"));
		List<String> list = bookList;
		System.out.println();
		System.out.println("Using list "+list);
		Collection<String> collection = list;
		System.out.println(collection);
		// Iterator iter=collection.iterator();
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		for (Object book : bookList) {
			System.out.println(book);
		}
		for (int i = 0; i < bookList.size(); i++) {
			System.out.println(bookList.get(i));
		}
		Collections.sort(bookList);
		System.out.println(bookList);
		int foundat=Collections.binarySearch(bookList,"Java in Action");
	   System.out.println();
		System.out.println("Using binary search  "+foundat);
		System.out.println();
		Object books[]=collection.toArray();
		System.out.println(books.length);
		List<Object> listofBooks=Arrays.asList(books);
		System.out.println(listofBooks);*/
	}

}
