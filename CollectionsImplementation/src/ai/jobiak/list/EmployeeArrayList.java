package ai.jobiak.list;

public class EmployeeArrayList {
	int rollno;  
	  String name;  
	  int age;  
	  public EmployeeArrayList() {
		// TODO Auto-generated constructor stub
	}
	public EmployeeArrayList(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "EmployeeArrayList [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}
	  

}
