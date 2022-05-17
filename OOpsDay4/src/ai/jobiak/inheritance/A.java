package ai.jobiak.inheritance;

public class A {

	int x;
	private int a = 10;

	public A() {
		// TODO Auto-generated constructor stub
		System.out.println("from A"+a);
	}
	

	public A(int x, int a) {
	
		this.x = x;
		this.a = a;
		System.out.println("from A intint"+this.a);
	}


	void method() {
		System.out.println("from method");
	}
}
