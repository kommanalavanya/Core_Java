package ai.jobiak.inheritance.overriding;

public class CreateShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Shape();
		double result=s.area();
		System.out.println(result);
		Rectangle rect=new Rectangle(36,79);
		
		 result=rect.area();
		System.out.println(result);
		Circle  circle=new Circle(54.55);
		result=circle.area();
		System.out.println(result);
		Shape s1=new Rectangle(36,79);
		System.out.println(s1.area());
		
	}

}
