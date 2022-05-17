import java.util.Scanner;

public class TestThreadMethods {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("main started");
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isAlive());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().isDaemon());
		MyThread t1=new MyThread("t1");
		//t1.setPriority(Thread.MAX_PRIORITY);
		MyThread t2=new MyThread("t2");
		//String s=sc.nextLine();
		//System.out.println(s);
		t1.start();
		t1.yield();
		t2.start();
		Thread.sleep(2000);
        System.out.println("main exited");
	}
	
	

}
