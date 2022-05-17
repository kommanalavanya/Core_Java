package com.jobiak.java8;

@FunctionalInterface

interface Test{
	public default  void paint() {
		System.out.println("In default method");
	}
	public static void method() {
		System.out.println("from static method");
	}
	public void print();
}
class TestImp implements Test{

	@Override
	public void print() {
		
		
	}
	
}
interface Test2{
	public void add(int a,int b);
}
interface Test3{
	public int factorial(int n);
}
interface Test4{
	public String getString();
}
public class TestLambda {

	public static void main(String[] args) {
		Test test=()->{
			System.out.println("from print.....priinting");};
			test.print();
		
//    Runnable r=()->{
//    	for(int i=0;i<5;i++) {
//    		System.out.println(Thread.currentThread().getName()+i);
//    	}
//    };
//    Thread t=new Thread(r);
//    t.start();
//	}
	Test2 test2=(int a,int b)->{
		int c=a+b;
		System.out.println(c);
	};
    test2.add(2,3);
    Test3 test3=(int n)->{
    	int fact=1;
    	int i=1;
    	while(i<=n) {
    		fact*=i;
    		i++;
    	}
    	return fact;
    };
    int factres=test3.factorial(5);
    System.out.println(factres);

	
	//anonymous class
	Runnable r=new Runnable() {
		public void run() {
			System.out.println("from run method.....");
		}
		
	};
	Thread t=new Thread(r);
	t.start();
	
	
	Test4 test4=()->"java";
	System.out.println(test4.getString());
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
}
