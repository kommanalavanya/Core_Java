package ai.jobiak.otherclasses;

public class Hexagon extends Shape {
  double side;
  public Hexagon() {
	// TODO Auto-generated constructor stub
}
  
	public Hexagon(double side) {
	super();
	this.side = side;
}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return ((3*Math.cbrt(3))/2)*(side*side);
	}
	public double perimeter() {
		return 6*side;
	}

}
