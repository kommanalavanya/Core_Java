package ai.jobiak.threads;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+"#entered run()=");
		}

	}

}
