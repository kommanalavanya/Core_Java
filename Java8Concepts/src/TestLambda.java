interface Drawable{
	public void draw();
}
public class TestLambda {

	public static void main(String[] args) {
		Drawable d=()->{
			System.out.println("Drawing");
           };
           d.draw();

	}

}
