package ai.jobiak.lambdas;

@FunctionalInterface
interface  Drawable2{
	public void draw();
}
public class LambdaExpression {

	public static void main(String[] args) {
		// Using Lambda
		Drawable2 d1=()->{
			System.out.println("drawing");
		};
		d1.draw();

	}

}
