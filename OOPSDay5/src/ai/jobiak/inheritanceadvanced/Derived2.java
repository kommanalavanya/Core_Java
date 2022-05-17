package ai.jobiak.inheritanceadvanced;

public class Derived2 extends Base2 {
	int data=20;
	public Derived2() {
		// TODO Auto-generated constructor stub
		System.out.println(super.data);
		System.out.println(this.data);
	}
	void m() {
		//m()-this cannot be done in java as it leads to stack overflow
		super.m();
		System.out.println("Derived2 m()");
	}

}
