package ai.jobiak.inheritance.overriding;

public class A {
	//SRP-single Responsibility Principle
	private int a,b;
	public A() {
		// TODO Auto-generated constructor stub
	}
	public A(int a, int b) {
	  
		this.a = a;
		this.b = b;
		System.out.println(this.a);
		System.out.println(this.b);
	}
	
	

}
