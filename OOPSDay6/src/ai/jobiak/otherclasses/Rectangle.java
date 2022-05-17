package ai.jobiak.otherclasses;

public class Rectangle extends Shape {
	double length;
	double breadth;
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Rectangle(double length, double breadth) {
		
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
		return length*breadth;
		
	}


	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}
	

}
