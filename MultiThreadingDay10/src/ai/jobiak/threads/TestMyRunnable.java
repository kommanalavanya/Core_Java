package ai.jobiak.threads;

public class TestMyRunnable {

	public static void main(String[] args) {
		System.out.println("Started Thread main");
		MyRunnable runnable=new MyRunnable();
		Thread t1=new Thread(runnable);
		Thread t2=new Thread(runnable);
		t1.start();
		t2.start();
		System.out.println("exiting main");

	}

}
