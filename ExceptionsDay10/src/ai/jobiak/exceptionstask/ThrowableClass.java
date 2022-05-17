package ai.jobiak.exceptionstask;

public class ThrowableClass {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		int c;
		int arr[]= {1,2,3,4,5};
		try {
			c=a/b;
		}
		
		catch(ArithmeticException e) {
			System.out.println(e.getMessage()+" exception");
			//using tostring
			System.out.println(e.toString());
			//using print stack trace	
			e.printStackTrace();
		}
	   try {
				int res=arr[5];
			}catch(Throwable e) {
				e.printStackTrace();
			}
		
		
    
	}

}
