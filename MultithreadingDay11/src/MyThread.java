public class MyThread extends Thread {
	String name;
	public MyThread(String name) {
		this.name=name;
	}
	public void run() {
		for(int i=1;i<50;i++) {
			System.out.println(this.name+"#entered run()="+i);
		}
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	
	}
	

}
