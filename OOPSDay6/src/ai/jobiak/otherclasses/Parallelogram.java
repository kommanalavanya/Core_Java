package ai.jobiak.otherclasses;

public class Parallelogram extends Shape {
	double base, height;

	public Parallelogram() {
		// TODO Auto-generated constructor stub
	}

	public Parallelogram(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
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
		return base * height;
	}

	@Override
	public String toString() {
		return "Parallelogram [base=" + base + ", height=" + height + "]";
	}

}
