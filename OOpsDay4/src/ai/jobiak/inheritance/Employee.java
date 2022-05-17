package ai.jobiak.inheritance;

import java.time.LocalDateTime;



public class Employee {
	int empid;
	String fullName;
    LocalDateTime dateOfJoining;
   ResidenceAddress residence;//user defined type
  
    OfficeAddress office;
    static int managerid;
    public Employee() {
		// TODO Auto-generated constructor stub
	}
    

	public Employee(int empid, String fullName, LocalDateTime dateOfJoining, ResidenceAddress residence,
			OfficeAddress office,int managerid) {
	
		this.empid = empid;
		this.fullName = fullName;
		this.dateOfJoining = dateOfJoining;
		this.residence = residence;
		this.office = office;
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


	public ResidenceAddress getResidence() {
		return residence;
	}


	public void setResidence(ResidenceAddress residence) {
		this.residence = residence;
	}


	public OfficeAddress getOffice() {
		return office;
	}


	public void setOffice(OfficeAddress office) {
		this.office = office;
	}


	public static int getManagerid() {
		return managerid;
	}


	public static void setManagerid(int managerid) {
		Employee.managerid = managerid;
	}


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", fullName=" + fullName + ", dateOfJoining=" + dateOfJoining
				+ ", residence=" + residence + ", office=" + office + "]";
	}


	
	

	
	
}
