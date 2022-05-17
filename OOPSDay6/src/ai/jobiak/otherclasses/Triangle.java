package ai.jobiak.otherclasses;

public class Triangle extends Shape {
	double length, breadth;

	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	public Triangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (length * breadth) / 2;
	}

	@Override
	public String toString() {
		return "Triangle [length=" + length + ", breadth=" + breadth + "]";
	}

}
