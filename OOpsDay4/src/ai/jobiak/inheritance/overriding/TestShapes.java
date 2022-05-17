package ai.jobiak.inheritance.overriding;

public class TestShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Object obj=new Rectangle();
		Shape s=new Rectangle(34.76,89.70);
		s.area();
		double result=s.area();
		System.out.println(result);
		//s=new Circle(54.8908);
		result=s.area();
		System.out.println(result);

	}

}
