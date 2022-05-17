package ai.jobiak.inheritance;

import java.time.LocalDateTime;

public class TestInheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a1 = new Address();
		ResidenceAddress residence = new ResidenceAddress("firstFloor126", "dilsuknagar", "hyderabad", "jaya nilayam",
				"Andhra University", "10am-12am");
		OfficeAddress office = new OfficeAddress("#786", "kompally", "hyderabad", 9887654321L, "Dr.Reddy", "B2Cellar");
		Employee emp = new Employee(101, "John doe", LocalDateTime.now(), residence, office, 1);
		System.out.println(emp);
	    //a1.setCity("Bangalore");
	    System.out.println(a1);
	    System.out.println(residence);
	    System.out.println(office);
		
		
	}

}
