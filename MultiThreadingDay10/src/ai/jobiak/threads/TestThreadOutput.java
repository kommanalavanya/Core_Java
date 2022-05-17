package ai.jobiak.threads;

public class TestThreadOutput {

	public static void main(String[] args) throws InterruptedException {
		MyThread t1=new MyThread("t1");

		t1.start();
		//t1.join();
		for(int i=1;i<50;i++) {
			System.out.println(Thread.currentThread().getName()+" ->"+i);
		}

	}

}
