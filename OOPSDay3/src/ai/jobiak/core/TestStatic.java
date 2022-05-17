package ai.jobiak.core;

public class TestStatic {
	 int a;
	 static int b;
	void method()
	{
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// error System.out.println(a);
		//error because this cannot be accessed in static context System.out.println(this.a);
		System.out.println(b);
		System.out.println(Math.round(34.888876555));

	}

}
