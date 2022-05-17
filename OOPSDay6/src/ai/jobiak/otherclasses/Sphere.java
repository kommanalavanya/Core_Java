package ai.jobiak.otherclasses;

public class Sphere extends Shape {
	double radius;

	public Sphere() {
		// TODO Auto-generated constructor stub
	}

	public Sphere(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub

		return 4 / 3 * Math.PI * radius * radius * radius;
	}

	public double area() {
		return 4 * Math.PI * radius * radius;
	}

	@Override
	public String toString() {
		return "Sphere [radius=" + radius + "]";
	}

}
