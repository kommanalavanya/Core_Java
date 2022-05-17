package ai.jobiak.otherclasses;

public class Cylinder extends Shape {
	double radius, height;

	public Cylinder() {
		// TODO Auto-generated constructor stub
	}

	public Cylinder(double radius, double height) {
		super();
		this.radius = radius;
		this.height = height;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
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
		return 2 * Math.PI * radius * height;
	}

	public double total_surface_area() {
		return 2 * Math.PI * radius * (radius + height);

	}

	public double volume() {
		return Math.PI * radius * radius * height;
	}

	@Override
	public String toString() {
		return "Cylinder [radius=" + radius + ", height=" + height + "]";
	}

}
