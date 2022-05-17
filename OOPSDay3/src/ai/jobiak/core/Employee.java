package ai.jobiak.core;

import java.time.LocalDateTime;

public class Employee {
	int empid;
	String fullName;
    LocalDateTime dateOfJoining;
    Address residence;//user defined type
    Address communication;//has a relationship-composition
    Address office;
    static int managerid;
    public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String fullName, LocalDateTime dateOfJoining, Address residence, Address communication,
			Address office,int managerid) {
		
		this.empid = empid;
		this.fullName = fullName;
		this.dateOfJoining = dateOfJoining;
		this.residence = residence;
		this.communication = communication;
		this.office=office;
		Employee.managerid = managerid;
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
	public Address getResidence() {
		return residence;
	}
	public void setResidence(Address residence) {
		this.residence = residence;
	}
	public Address getCommunication() {
		return communication;
	}
	public void setCommunication(Address communication) {
		this.communication = communication;
	}
	public Address getOffice() {
		return office;
	}
	public void setOffice(Address office) {
		this.office = office;
	}
	public int getManagerid() {
		return managerid;
	}
	
	public void setManagerid(int managerid) {
		Employee.managerid = managerid;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", fullName=" + fullName + ", dateOfJoining=" + dateOfJoining
				+ ", residence=" + residence + ", communication=" + communication + ", office=" + office + "]";
	}
	

	
	
    

}
