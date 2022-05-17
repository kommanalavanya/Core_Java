package ai.jobiak.list;

import java.util.ArrayList;

public class CreateEmployee {

	public static void main(String[] args) {
		  EmployeeArrayList e1=new EmployeeArrayList(101,"Sonoo",23);  
		  EmployeeArrayList e2=new EmployeeArrayList(102,"Ravi",21);  
		 ArrayList<Object> obj1=new ArrayList<>();
         obj1.add(e1);
         obj1.add(e2);
         System.out.println(obj1);
        
	}

}
