package ai.jobiak.threads;

public class TestThreads {

	public static void main(String[] args) {
		System.out.println("started main.........");
		MyThread t1=new MyThread("t1");
		MyThread t2=new MyThread("t2");
		//System.out.println(t1.getName()+" has "+t1.getPriority());
		
		//t1.setDaemon(true);
		t2.setDaemon(true);
		t1.start();
		t2.start();
		System.out.println("exiting main.......");

	}

}
