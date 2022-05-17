package ai.jobiak.exceptions;

public class TestCode {

	public static void main(String[] args) {
		try {
	int a=10;
	int b=0;
	int c=a/b;
	System.out.println(c);
		}catch(ArithmeticException e) {
			System.err.println(e.getMessage());
			
		}
		System.out.println("After handling exception");

	}

}
