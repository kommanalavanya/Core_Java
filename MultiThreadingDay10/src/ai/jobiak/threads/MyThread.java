package ai.jobiak.threads;

public class MyThread extends Thread {
	String name;
	public MyThread(String name) {
		this.name=name;
	}
	public void run() {
		for(int i=1;i<500;i++) {
			System.out.println(this.name+"#entered run()="+i);
		}
	}

}
