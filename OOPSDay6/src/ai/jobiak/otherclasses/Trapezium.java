package ai.jobiak.otherclasses;

public class Trapezium extends Shape {
	double side1, side2, height;

	public Trapezium() {
		// TODO Auto-generated constructor stub
	}

	public Trapezium(double side1, double side2, double height) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.height = height;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (1 / 2) * height * (side1 + side2);
	}

	@Override
	public String toString() {
		return "Trapezium [side1=" + side1 + ", side2=" + side2 + ", height=" + height + "]";
	}

}
