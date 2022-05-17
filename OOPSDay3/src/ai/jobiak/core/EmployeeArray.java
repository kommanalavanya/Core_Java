package ai.jobiak.core;

import java.time.LocalDateTime;

public class EmployeeArray{ 
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
	
	Employee empArray[]=new Employee[5];
	empArray[0]=emp;
	empArray[1]=emp1;
	empArray[2]=emp2;
	empArray[3]=emp3;
	empArray[4]=emp4;
	System.out.println("Details of all employee");
	for(int i=0;i<empArray.length;i++)
	{
		System.out.println(empArray[i]);
	}


	System.out.println("Residential address of all employees");
	

	Address a1[]=new Address[5];
    a1[0]=res;
    a1[1]=resE1;
    a1[2]=resE2;
    a1[3]=resE3;
    a1[4]=resE4;
    for(int i=0;i<a1.length;i++)
	{
		System.out.println("residential address of employee"+""+(i+1)+" "+a1[i]);
	}
	
	
}
	
	
}
