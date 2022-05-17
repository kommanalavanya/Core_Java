
public class ClassDemo {
	int a=10;
	
	public static void main(String[] args) {
		
	
	//global scope or class scope
		ClassDemo c=new ClassDemo();
		c.method();	
	}
	
	
	 void method() {
		int a=20;
		System.out.println(a);
		System.out.println(this.a);
		
		
	  }
	
}

 
