package ai.jobiak.lambdas;

interface Drawable{
	public void draw();
}
public class Anonymous {

	public static void main(String[] args) {
		//Without Lambdas
		int width=10;
		Drawable d1=new Drawable() {
			public void draw() {System.out.println("Drawing "+width);}
		};
		d1.draw();

	}

}
