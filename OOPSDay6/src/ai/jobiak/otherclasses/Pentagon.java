package ai.jobiak.otherclasses;

public class Pentagon extends Shape {
	double side, radius;

	public Pentagon() {
		// TODO Auto-generated constructor stub
	}

	public Pentagon(double side, double radius) {
		super();
		this.side = side;
		this.radius = radius;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (5 / 2) * side * radius;
	}

	@Override
	public String toString() {
		return "Pentagon [side=" + side + ", radius=" + radius + "]";
	}

}
