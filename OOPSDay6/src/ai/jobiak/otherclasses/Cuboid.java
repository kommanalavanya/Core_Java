package ai.jobiak.otherclasses;

public class Cuboid extends Shape {

	private double length, breadth, height;

	public Cuboid() {
		// TODO Auto-generated constructor stub
	}

	public Cuboid(double length, double breadth, double height) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.height = height;
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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 2 * height * (length + breadth);
	}

	public double totalSurfaceArea() {
		return 2 * ((length * breadth) + (breadth * height) + (length * height));
	}

	public double volume() {
		return (length * breadth * height);
	}

	@Override
	public String toString() {
		return "Cube [length=" + length + ", breadth=" + breadth + ", height=" + height + "]";
	}

}
