package ai.jobiak.StreamsTask;
import java.util.*;
class Employee{
	String empname;
	int empid;
	public Employee(String empname, int empid) {
		
		this.empname = empname;
		this.empid = empid;
	}
	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", empid=" + empid + "]";
	}
	
	
}

public class Sorted_Compareto {

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		list.add(new Employee("john",101));
		list.add(new Employee("aman",102));
		list.stream().sorted((emp1,emp2)->emp1.empname.compareTo(emp2.empname)) 
		.forEach(System.out::println);
		

	}

}
