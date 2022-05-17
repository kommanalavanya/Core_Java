package ai.jobiak.inheritance.overriding;

public class Circle {
	private double radius;
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double area()
	{
		return 2*Math.PI*radius*radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	

}
