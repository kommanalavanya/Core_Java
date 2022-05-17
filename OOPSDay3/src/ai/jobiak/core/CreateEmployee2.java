package ai.jobiak.core;

import java.time.LocalDateTime;

public class CreateEmployee2 {

	public static void main(String[] args) {
	Address res=new Address("Firstfloor126","Dilshuknagar","Hyderabad");
	Address com=new Address("IIt Campus 143","Gachhbowli","Hyderabad");
	Address off=new Address("IIt Campus 123","LBnagar","Hyderabad");
	Employee emp=new Employee(101,"John Doe",LocalDateTime.now(),res,com,off,0);
	
	
	Address resE1=new Address("#2456","Jublihills","Hyderabad");
	Address comE1=new Address("IIIt Campus 143","Gachhbowli","Hyderabad");
	Address offE1=new Address("IIt Campus 121","NAD","Visakhapatnam");
	Employee emp1=new Employee(102,"Jones Doe",LocalDateTime.now(),resE1,comE1,offE1,1);
	
	
	Address resE2=new Address("#1567","Towlicholi","Hyderabad");
	Address comE2=new Address("IIt Campus 143","Gachhbowli","Hyderabad");
	Address offE2=new Address("44-9-70/8","Gajuwaka","Visakhapatnam");
	Employee emp2=new Employee(103,"Json Doe",LocalDateTime.now(),resE2,comE2,offE2,2);
	
	Address resE3=new Address("#786","kompally","Hyderabad");
	Address comE3=new Address("IIt Campus 143","Gachhbowli","Hyderabad");
	Address offE3=new Address("#8970","Sheelanagar","Visakhapatnam");
	Employee emp3=new Employee(104,"Jonas Doe",LocalDateTime.now(),resE3,comE3,offE3,1);
	
	Address resE4=new Address("#3456","Bowenpally","Hyderabad");
	Address comE4=new Address("IIt Campus 143","Gachhbowli","Hyderabad");
	Address offE4=new Address("#6754","steelPlant","Visakhapatnam");
	Employee emp4=new Employee(105,"Jinny Doe",LocalDateTime.now(),resE4,comE4,offE4,1);
	System.out.println(emp);
	System.out.println(emp1);
	System.out.println(emp2);
	System.out.println(emp3);
	System.out.println(emp4);
	emp1.setManagerid(121);//use of static		
	System.out.println(emp);
	System.out.println(emp1);
	System.out.println(emp2);
	System.out.println(emp3);
	System.out.println(emp4);
	System.out.println(Employee.managerid);


	}

}
