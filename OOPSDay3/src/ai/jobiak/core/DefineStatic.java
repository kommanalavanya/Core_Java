package ai.jobiak.core;

public class DefineStatic {
	String dept1;
	int deptid;
	static String collegeName;
	public DefineStatic() {
		// TODO Auto-generated constructor stub
	}
	public DefineStatic(String dept1, int deptid,String collegeName) {
		
		this.dept1 = dept1;
		this.deptid = deptid;
		DefineStatic.collegeName=collegeName;
	}
	{
		System.out.println("static block is");
	}
	
	public String getDept1() {
		return dept1;
	}
	public void setDept1(String dept1) {
		this.dept1 = dept1;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	
	public static void setCollegeName(String collegeName) {
		DefineStatic.collegeName = collegeName;
	}
	
	
	
}
