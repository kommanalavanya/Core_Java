package ai.jobiak.inheritance.overriding;

public class B extends A {
	public B() {
		super(2,3);
		System.out.println("default");
	}
	void m() {
		System.out.println("B's method");
	}
	
}
