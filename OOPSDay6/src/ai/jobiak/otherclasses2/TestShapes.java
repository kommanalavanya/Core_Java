package ai.jobiak.otherclasses2;

public class TestShapes {

	public static void main(String[] args) {
		Rectangle rect=new Rectangle();
		boolean result=rect instanceof Object;
		result=rect instanceof Rectangle;
		result=rect instanceof Shape;
		System.out.println(result);
		System.out.println(Shape.PIE);
		// error Shape.PIE=3.141;
		
		
		
		
		
		
		/*Shape s=null;
		s=new Rectangle();
		s.area();
		s=new Circle();
		s.area();*/
		

	}

}
