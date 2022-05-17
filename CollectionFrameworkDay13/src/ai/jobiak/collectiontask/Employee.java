package ai.jobiak.collectiontask;

import java.time.LocalDateTime;

public class Employee {
	int empid;
	String fullName;
    LocalDateTime dateOfJoining;
   
    static int managerid;
    public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int empid, String fullName, LocalDateTime dateOfJoining,
			int managerid) {
		super();
		this.empid = empid;
		this.fullName = fullName;
		this.dateOfJoining = dateOfJoining;
		Employee.managerid=managerid;
	}

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public LocalDateTime getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(LocalDateTime dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	
	public int getManagerid() {
		return managerid;
	}
	
	public void setManagerid(int managerid) {
		Employee.managerid = managerid;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", fullName=" + fullName + ", dateOfJoining=" + dateOfJoining + "]";
	}
	
	

	
	
    

}
