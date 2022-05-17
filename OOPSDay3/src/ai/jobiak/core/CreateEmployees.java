package ai.jobiak.core;

import java.time.LocalDateTime;

public class CreateEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address res=new Address("Firstfloor126","Dilshuknagar","Hyderabad");
		Address com=new Address("IIt Campus 143","Gachhbowli","Hyderabad");
		Address off=new Address("IIt Campus 123","LBnagar","Hyderabad");
		System.out.println(off);
		Employee emp=new Employee(101,"John Doe",LocalDateTime.now(),res,com,off,1);
		System.out.println(emp);
		//to obtain composed instance,first obtain the reference of composed object with get
		//emp.getResidence().setBuilding("satyam");
		//Address 
		//System.out.println(emp);
		////System.out.println(emp.getResidence());
		//System.out.println(emp.getCommunication());
		Address residence=emp.getResidence();
		residence.setBuilding("financial district");
		System.out.println(residence);
		System.out.println("Same like above we can do in one step");
		emp.getResidence().setBuilding("satyam");
		System.out.println(residence);

	}

}
