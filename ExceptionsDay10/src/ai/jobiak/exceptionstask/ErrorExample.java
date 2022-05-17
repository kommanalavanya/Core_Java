package ai.jobiak.exceptionstask;

public class ErrorExample {
	static void increment(int i)
	{
		increment(i++);//stack overflow
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		increment(1);

	}
  
}
