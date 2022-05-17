package ai.jobiak.core;

public class TestStatic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefineStatic obj1 = new DefineStatic("cse", 1, "Jntuk");
		//DefineStatic obj2 = new DefineStatic("eee", 2, "Jntuk");
		
		System.out.println(obj1.dept1);
		System.out.println(obj1.deptid);
		System.out.println(DefineStatic.collegeName);
		DefineStatic.setCollegeName("Andhra University");
		System.out.println("");
		System.out.println("Accessing static variable through nonstatic");
		System.out.println("");
		//System.out.println(obj1.collegeName);
		//System.out.println(obj2.collegeName);
        
	}

}
