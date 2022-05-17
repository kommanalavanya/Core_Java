package ai.jobiak.collections;
import java.util.*;

public class TestBulkOperations {

	public static void main(String[] args) {
		ArrayList<String> companies=new ArrayList<String>();
		companies.add("google");
		companies.add("microsoft");
		companies.add("goldman sachs");
		companies.add("Franklin templeton");
		companies.add("uber");
		System.out.println(companies);
		HashSet setofTelecomcompanies=new HashSet();
		setofTelecomcompanies.add("reliance");
		setofTelecomcompanies.add("airtel");
		setofTelecomcompanies.add("idea");
		setofTelecomcompanies.add("BSNL");
		System.out.println(setofTelecomcompanies);
		//System.out.println(setofTelecomcompanies.add(companies));
		//System.out.println(setofTelecomcompanies);
		System.out.println(setofTelecomcompanies.addAll(companies));
		System.out.println(setofTelecomcompanies);
		System.out.println(setofTelecomcompanies.containsAll(companies));
		setofTelecomcompanies.removeAll(companies);
		System.out.println(setofTelecomcompanies);
//		setofTelecomcompanies.add("airtel");
//		setofTelecomcompanies.add("idea");
//		setofTelecomcompanies.add("BSNL"););
//		ArrayList<String> setofTelecomcompanies=new ArrayList<String>();
//		setofTelecomcompanies.add("reliance");
//		setofTelecomcompanies.add("airtel");
//		setofTelecomcompanies.add("idea");
//		setofTelecomcompanies.add("BSNL");
//		System.out.println(setofTelecomcompanies);
//		System.out.println(setofTelecomcompanies.addAll(companies));
//		
//		setofTelecomcompanies.add("google");
//		setofTelecomcompanies.add("microsoft");
//		setofTelecomcompanies.add("goldman sachs");
//		setofTelecomcompanies.add("Franklin templeton");
//		setofTelecomcompanies.add("uber");
//		System.out.println(setofTelecomcompanies.containsAll(companies));
		ArrayList<String> complist=new ArrayList<String>();
		complist.add("google");
		complist.add("apple");
		complist.add("Franklin templeton");
		complist.add("goldman sachs");
		complist.add("accenture");
		complist.add("jobiak");
		System.out.println(complist);
		//HashSet compset=new HashSet();
		SortedSet sortedset=new TreeSet();
		sortedset.add("reliance");
		sortedset.add("airtel");
		sortedset.add("idea cellular");
		sortedset.add("bSNL");
		sortedset.add("jobiak");
		sortedset.add("google");
		sortedset.add("goldman sachs");
		sortedset.add("swiss rey");
		sortedset.add("gE Digital");
		sortedset.add("master Card");
		System.out.println(sortedset);
		Set<String> headSet=sortedset.headSet("google");
		System.out.println(headSet);
		Set<String> subset=sortedset.subSet("gE Digital", "master Card");
		System.out.println(subset);
		Set<String> tailset=sortedset.tailSet("google");
		System.out.println(tailset);
		
		
		
	}

}
