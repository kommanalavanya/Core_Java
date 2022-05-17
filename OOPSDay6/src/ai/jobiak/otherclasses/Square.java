package ai.jobiak.otherclasses;

public class Square extends Shape {
	double side;

	public Square() {
		// TODO Auto-generated constructor stub
	}

	public Square(double side) {
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
		return side * side;
	}

	public double perimeter() {
		return 4 * side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}

}
